/*
 * RED5 Open Source Flash Server - http://code.google.com/p/red5/
 * 
 * Copyright 2006-2012 by respective authors (see below). All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.red5.client.net.rtmp;

import java.net.InetSocketAddress;
import java.util.Map;

import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.transport.socket.SocketConnector;
import org.apache.mina.transport.socket.nio.NioSocketConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RTMP client implementation supporting "rtmp" and "rtmpe" protocols.
 * 
 * @author The Red5 Project (red5@osflash.org)
 * @author Christian Eckerle (ce@publishing-etc.de)
 * @author Joachim Bauch (jojo@struktur.de)
 * @author Paul Gregoire (mondain@gmail.com)
 * @author Steven Gong (steven.gong@gmail.com)
 * @author Anton Lebedevich (mabrek@gmail.com)
 * @author Tiago Daniel Jacobs (tiago@imdt.com.br)
 * @author Jon Valliere
 */
public class RTMPClient extends BaseRTMPClientHandler {

	private static final Logger log = LoggerFactory.getLogger(RTMPClient.class);

	protected static final int CONNECTOR_WORKER_TIMEOUT = 7000; // seconds

	// I/O handler
	private final RTMPMinaIoHandler ioHandler;

	// Socket connector, disposed on disconnect
	protected SocketConnector socketConnector;

	// 
	protected ConnectFuture future;
	
	/** Constructs a new RTMPClient. */
	public RTMPClient() {
		ioHandler = new RTMPMinaIoHandler();
		ioHandler.setHandler(this);
		ioHandler.setRtmpConnManager(RTMPClientConnManager.getInstance());
	}

	public Map<String, Object> makeDefaultConnectionParams(String server, int port, String application) {
		Map<String, Object> params = super.makeDefaultConnectionParams(server, port, application);
		if (!params.containsKey("tcUrl")) {
			params.put("tcUrl", String.format("%s://%s:%s/%s", protocol, server, port, application));
		}
		return params;
	}

	@Override
	protected void startConnector(String server, int port) {
		socketConnector = new NioSocketConnector();
		socketConnector.setHandler(ioHandler);
		future = socketConnector.connect(new InetSocketAddress(server, port));
		future.addListener(new IoFutureListener<ConnectFuture>() {
			public void operationComplete(ConnectFuture future) {
				try {
					// will throw RuntimeException after connection error
					future.getSession();
				} catch (Throwable e) {
					socketConnector.dispose(false);
					// if there isn't an ClientExceptionHandler set, a RuntimeException may be thrown in handleException
					handleException(e);
				}
			}
		});
		// Now wait for the close to be completed
		future.awaitUninterruptibly(CONNECTOR_WORKER_TIMEOUT);
	}

	@Override
	public void disconnect() {
		if (future != null) {
			try {
				// close requesting that the pending messages are sent before the session is closed
				future.getSession().close(false);
				// now wait for the close to be completed
				future.awaitUninterruptibly(CONNECTOR_WORKER_TIMEOUT);
			} catch (Exception e) {
				log.warn("Exception during disconnect", e);
			} finally {
				// We can now dispose the connector
				socketConnector.dispose(false);
			}
		}
		super.disconnect();
	}

	/**
	 * Sets the RTMP protocol, the default is "rtmp". If "rtmps" or "rtmpt" are required, the appropriate
	 * client type should be selected.
	 * 
	 * @param protocol the protocol to set
	 * @throws Exception 
	 */
	@Override
	public void setProtocol(String protocol) throws Exception {
		this.protocol = protocol;
		if ("rtmps".equals(protocol) || "rtmpt".equals(protocol) || "rtmpte".equals(protocol) || "rtmfp".equals(protocol)) {
			throw new Exception("Unsupported protocol specified, please use the correct client for the intended protocol.");
		}
	}

}
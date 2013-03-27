/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.room;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.basic.Server;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.room.Client.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Mar 27 09:07:18 CST 2013")
public class Client_ {
    public static volatile SingularAttribute<Client,Boolean> allowRecording;
    public static volatile SingularAttribute<Client,String> avsettings;
    public static volatile SingularAttribute<Client,Long> broadCastID;
    public static volatile SingularAttribute<Client,Boolean> canDraw;
    public static volatile SingularAttribute<Client,Boolean> canGiveAudio;
    public static volatile SingularAttribute<Client,Boolean> canRemote;
    public static volatile SingularAttribute<Client,Boolean> canShare;
    public static volatile SingularAttribute<Client,Date> connectedSince;
    public static volatile SingularAttribute<Client,String> externalUserId;
    public static volatile SingularAttribute<Client,String> externalUserType;
    public static volatile SingularAttribute<Client,String> firstname;
    public static volatile SingularAttribute<Client,Long> flvRecordingId;
    public static volatile SingularAttribute<Client,Long> flvRecordingMetaDataId;
    public static volatile SingularAttribute<Client,String> formatedDate;
    public static volatile SingularAttribute<Client,Long> id;
    public static volatile SingularAttribute<Client,Integer> interviewPodId;
    public static volatile SingularAttribute<Client,Boolean> isAVClient;
    public static volatile SingularAttribute<Client,Boolean> isBroadcasting;
    public static volatile SingularAttribute<Client,Boolean> isMod;
    public static volatile SingularAttribute<Client,Boolean> isRecording;
    public static volatile SingularAttribute<Client,Boolean> isScreenClient;
    public static volatile SingularAttribute<Client,Boolean> isSuperModerator;
    public static volatile SingularAttribute<Client,String> language;
    public static volatile SingularAttribute<Client,String> lastLogin;
    public static volatile SingularAttribute<Client,String> lastname;
    public static volatile SingularAttribute<Client,String> mail;
    public static volatile SingularAttribute<Client,Boolean> micMuted;
    public static volatile SingularAttribute<Client,String> official_code;
    public static volatile SingularAttribute<Client,Long> organization_id;
    public static volatile SingularAttribute<Client,String> picture_uri;
    public static volatile SingularAttribute<Client,String> publicSID;
    public static volatile SingularAttribute<Client,Date> roomEnter;
    public static volatile SingularAttribute<Client,String> roomRecordingName;
    public static volatile SingularAttribute<Client,Long> room_id;
    public static volatile SingularAttribute<Client,String> scope;
    public static volatile SingularAttribute<Client,Boolean> screenPublishStarted;
    public static volatile SingularAttribute<Client,Server> server;
    public static volatile SingularAttribute<Client,Boolean> sipTransport;
    public static volatile SingularAttribute<Client,Boolean> startRecording;
    public static volatile SingularAttribute<Client,Boolean> startStreaming;
    public static volatile SingularAttribute<Client,String> streamPublishName;
    public static volatile SingularAttribute<Client,Boolean> streamPublishStarted;
    public static volatile SingularAttribute<Client,String> streamid;
    public static volatile SingularAttribute<Client,String> swfurl;
    public static volatile SingularAttribute<Client,Long> user_id;
    public static volatile SingularAttribute<Client,String> usercolor;
    public static volatile SingularAttribute<Client,String> userip;
    public static volatile SingularAttribute<Client,String> username;
    public static volatile SingularAttribute<Client,Integer> userport;
    public static volatile SingularAttribute<Client,Integer> userpos;
    public static volatile SingularAttribute<Client,Integer> vHeight;
    public static volatile SingularAttribute<Client,Integer> vWidth;
    public static volatile SingularAttribute<Client,Integer> vX;
    public static volatile SingularAttribute<Client,Integer> vY;
    public static volatile SingularAttribute<Client,Boolean> zombieCheckFlag;
}

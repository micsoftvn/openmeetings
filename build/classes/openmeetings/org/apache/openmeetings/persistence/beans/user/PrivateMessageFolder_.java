/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.user;

import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.user.PrivateMessageFolder.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Mar 06 22:04:00 CST 2013")
public class PrivateMessageFolder_ {
    public static volatile SingularAttribute<PrivateMessageFolder,String> folderName;
    public static volatile SingularAttribute<PrivateMessageFolder,Date> inserted;
    public static volatile SingularAttribute<PrivateMessageFolder,Long> privateMessageFolderId;
    public static volatile SingularAttribute<PrivateMessageFolder,Date> updated;
    public static volatile SingularAttribute<PrivateMessageFolder,Long> userId;
}

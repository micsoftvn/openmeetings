/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.basic;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.user.User;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.basic.Configuration.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Mar 27 09:07:18 CST 2013")
public class Configuration_ {
    public static volatile SingularAttribute<Configuration,String> comment;
    public static volatile SingularAttribute<Configuration,String> conf_key;
    public static volatile SingularAttribute<Configuration,String> conf_value;
    public static volatile SingularAttribute<Configuration,Long> configuration_id;
    public static volatile SingularAttribute<Configuration,Boolean> deleted;
    public static volatile SingularAttribute<Configuration,Date> starttime;
    public static volatile SingularAttribute<Configuration,Date> updatetime;
    public static volatile SingularAttribute<Configuration,User> user;
}

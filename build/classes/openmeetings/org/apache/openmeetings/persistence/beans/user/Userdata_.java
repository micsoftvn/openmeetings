/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.user;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.user.Userdata.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Mar 27 09:07:18 CST 2013")
public class Userdata_ {
    public static volatile SingularAttribute<Userdata,String> comment;
    public static volatile SingularAttribute<Userdata,String> data;
    public static volatile SingularAttribute<Userdata,Long> data_id;
    public static volatile SingularAttribute<Userdata,String> data_key;
    public static volatile SingularAttribute<Userdata,Boolean> deleted;
    public static volatile SingularAttribute<Userdata,Date> starttime;
    public static volatile SingularAttribute<Userdata,Date> updatetime;
    public static volatile SingularAttribute<Userdata,Long> user_id;
}

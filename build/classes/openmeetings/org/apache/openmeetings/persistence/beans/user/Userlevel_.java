/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.user;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.user.Userlevel.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Mar 27 09:07:18 CST 2013")
public class Userlevel_ {
    public static volatile SingularAttribute<Userlevel,Boolean> deleted;
    public static volatile SingularAttribute<Userlevel,String> description;
    public static volatile SingularAttribute<Userlevel,Long> level_id;
    public static volatile SingularAttribute<Userlevel,Date> starttime;
    public static volatile SingularAttribute<Userlevel,Integer> statuscode;
    public static volatile SingularAttribute<Userlevel,Date> updatetime;
}

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
(value=org.apache.openmeetings.persistence.beans.basic.LdapConfig.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Mar 27 09:07:18 CST 2013")
public class LdapConfig_ {
    public static volatile SingularAttribute<LdapConfig,Boolean> addDomainToUserName;
    public static volatile SingularAttribute<LdapConfig,String> comment;
    public static volatile SingularAttribute<LdapConfig,String> configFileName;
    public static volatile SingularAttribute<LdapConfig,Boolean> deleted;
    public static volatile SingularAttribute<LdapConfig,String> domain;
    public static volatile SingularAttribute<LdapConfig,Date> inserted;
    public static volatile SingularAttribute<LdapConfig,User> insertedby;
    public static volatile SingularAttribute<LdapConfig,Boolean> isActive;
    public static volatile SingularAttribute<LdapConfig,Long> ldapConfigId;
    public static volatile SingularAttribute<LdapConfig,String> name;
    public static volatile SingularAttribute<LdapConfig,Date> updated;
    public static volatile SingularAttribute<LdapConfig,User> updatedby;
}

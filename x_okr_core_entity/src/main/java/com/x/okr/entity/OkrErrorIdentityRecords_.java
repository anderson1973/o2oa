/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.okr.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.okr.entity.OkrErrorIdentityRecords.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sat May 06 19:35:29 CST 2017")
public class OkrErrorIdentityRecords_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<OkrErrorIdentityRecords,Date> createTime;
    public static volatile SingularAttribute<OkrErrorIdentityRecords,String> flag;
    public static volatile SingularAttribute<OkrErrorIdentityRecords,String> id;
    public static volatile SingularAttribute<OkrErrorIdentityRecords,String> identity;
    public static volatile SingularAttribute<OkrErrorIdentityRecords,String> recordsJson;
    public static volatile SingularAttribute<OkrErrorIdentityRecords,String> sequence;
    public static volatile SingularAttribute<OkrErrorIdentityRecords,Date> updateTime;
}
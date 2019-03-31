package org.wwd.medcat.model.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

/** 
* @author jopensourcej
*/

@Getter
@Setter
@Document(collection = "app_ms_screen_action")

public class ScreenAction {
    private ObjectId _id;
    @Id
    @Field(value = "wg_id")
    private String wg_id;
    
    @Field(value = "appId")
    private String appId;
    
    @Field(value = "uniqueScreen")
    private String screenId;
    
    @Field(value = "pptSlideNumber")
    private String pptId;
    
    @Field(value = "actionId")
    private int actionId;
    
    @Field(value = "actionName")
    private String actionName;
    
    @Field(value = "conditions")
    private String conditions;
    
    @Field(value = "navigationScreenId")
    private String navScreens;
    
    @Field(value = "remarks")
    private String remarks;
    
    @Field(value = "active")
    private String active;
    
    @Field(value = "createdBy")
    private String createdBy;
    
    @Field(value = "lastModifiedBy")
    private String lastModifiedBy;
    
//    @Field(value = "createdDate")
//    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
//    private Date createdDate;
//    
//    @Field(value = "lastModifiedDate")
//    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
//    private Date lastModifiedDate;
}

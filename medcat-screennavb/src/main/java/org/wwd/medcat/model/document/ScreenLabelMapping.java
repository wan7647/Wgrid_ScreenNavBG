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
@Document(collection = "app_ms_screen_label_mapping")
public class ScreenLabelMapping {
	
	private ObjectId _id;
    
	@Id
    @Field(value = "wg_Id")
    private String wg_id;
	
    @Field(value = "appId")
    private String appId;
    
    @Field(value = "slideNumber")
    private String pptNo;
    
    @Field(value = "screenId")
    private String screenId;
    
    @Field(value = "labelText")
    private String labelText;
    
    @Field(value = "classify")
    private String classify;
    
    @Field(value = "labelId")
    private String labelID;
    
    @Field(value = "type")
    private String Type;
    
    @Field(value = "typelength")
    private String typelength;
    
    @Field(value = "dataentrysystemfield")
    private String dataentrysystemfield;
    
    @Field(value = "dataentrysystemfieldlength")
    private String dataentrysystemfieldlength;
    
    @Field(value = "dataentrysystemfieldtype")
    private String dataentrysystemfieldtype;
    
    @Field(value = "actionid")
    private String actionid;
    
    @Field(value = "comments")
    private String comments;
    
    @Field(value = "createdBy")
    private String createdBy;
    
    @Field(value = "lastModifiedBy")
    private String lastModifiedBy;
    //@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    //private String createdDate;
    //@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    //private String lastModifiedDate;
}

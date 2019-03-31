package org.wwd.medcat.model.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

/** 
* @author jopensourcej
*/

@Getter
@Setter
@Document(collection = "app_ms_generic_dd")
public class GenericDropDown {
    private ObjectId _id;
    @Id
    private String wg_id;
    private String appId;
    private String screenId;
    private String typeId;
    private String type;
    private String values;
    private String createdBy;
    private String lastModifiedBy;
    //@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private String createdDate;
    //@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private String lastModifiedDate;
}



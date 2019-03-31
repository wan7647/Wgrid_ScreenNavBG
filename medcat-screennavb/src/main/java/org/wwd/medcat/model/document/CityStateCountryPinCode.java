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
@Document(collection = "app_ms_cityStatecountryPincode")
public class CityStateCountryPinCode {
    private ObjectId _id;
    @Id
    private String wg_id;
    private String appid;
    private String country;
    private String state;
    private String city;
    private int pincode;
    private String createdBy;
    private String lastModifiedBy;
    //@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private String createdDate;
    //@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private String lastModifiedDate;
    
    
}

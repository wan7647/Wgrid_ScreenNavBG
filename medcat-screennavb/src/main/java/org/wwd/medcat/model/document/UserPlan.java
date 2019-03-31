package org.wwd.medcat.model.document;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

/** 
* @author jopensourcej
*/

@Getter
@Setter
@Document(collection = "wg_ms_user_plan")
public class UserPlan {
    private ObjectId _id;
    @Id
    private String wg_Id;
    private String appId;
    private String userId;
    private String userName;
    private String planId;
    private String planName;
    private String planDescription;
    private LocalDateTime planAllocationDate;
    private LocalDateTime planExpirationDate;
    private String[] userFeature;
    private String isCustomizable;
    private String[] additionalFeature;
    private LocalDateTime additionalFeatureAllocationDate;
    private LocalDateTime additionalFeatureExpirationDate;
    private String isActive;
    private String createdBy;
    private String lastModifiedBy;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date createdDate;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date lastModifiedDate;;
}

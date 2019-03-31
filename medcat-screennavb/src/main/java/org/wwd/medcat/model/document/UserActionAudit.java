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
@Document(collection = "app_his_useraction")
public class UserActionAudit {
    private ObjectId _id;
    @Id
    private String wg_Id;
    private String appId;
    private String screenId;
    private String actionId;
    private String actionName;
    private String actionStatus;
    private String userId;
    private String createdBy;
    private String lastModifiedBy;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date createdDate;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date lastModifiedDate;

}

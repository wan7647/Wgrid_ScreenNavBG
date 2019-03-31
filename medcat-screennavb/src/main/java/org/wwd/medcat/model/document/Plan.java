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
@Document(collection = "wg_ms_plan")
public class Plan {
    private ObjectId _id;
    @Id
    private String wg_Id;
    private String appId;
    private String planName;
    private String planDescription;
    private String[] planFeatures;
    private String[] planUI;
    private LocalDateTime startDate;
    private LocalDateTime expirationDate;
    private String active;
    private String createdBy;
    private String lastModifiedBy;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date createdDate;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date lastModifiedDate;
}

package org.wwd.medcat.model.document;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/** 
* @author jopensourcej
*/

@Getter
@Setter
@Document(collection = "wg_ms_user_profile")
public class UserProfile {
    private ObjectId _id;
    @Id
    private String wg_Id;
    private String appId;
    private String userId;
    private String displayUserId;
    private String firstName;
    private String lastName;
    private String gender;
    private String status;
    private String userProfileCompleted;
    private String registrationCompleted;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date dob;
    private String mobile;
    private String city;
    private String address;
    private String state;
    private String category;
    private String nationalId;
    private String password;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date lastLogin;
    private int loginAttempt;
    private String deviceFingerPrint;
    private String activeLatLong;
    private String active;
    private String createdBy;
    private String lastModifiedBy;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date createdDate;
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date lastModifiedDate;
}

package org.wwd.medcat.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.wwd.medcat.model.document.UserProfile;

/** 
* @author jopensourcej
*/
public interface UserProfileRepository extends MongoRepository<UserProfile,String> {
}

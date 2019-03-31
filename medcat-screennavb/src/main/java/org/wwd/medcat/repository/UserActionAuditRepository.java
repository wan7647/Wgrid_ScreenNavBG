package org.wwd.medcat.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.wwd.medcat.model.document.UserActionAudit;

/** 
* @author jopensourcej
*/
public interface UserActionAuditRepository extends MongoRepository<UserActionAudit,String> {

}

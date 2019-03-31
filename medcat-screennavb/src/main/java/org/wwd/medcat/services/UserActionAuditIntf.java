package org.wwd.medcat.services;

import org.springframework.stereotype.Component;
import org.wwd.medcat.model.document.UserActionAudit;

/** 
* @author jopensourcej
*/

@Component
public interface UserActionAuditIntf {
    public void saveUserActionAuditHistory(UserActionAudit actionAudit);
}

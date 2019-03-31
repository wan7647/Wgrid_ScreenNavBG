package org.wwd.medcat.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wwd.medcat.model.document.UserActionAudit;
import org.wwd.medcat.repository.UserActionAuditRepository;
import org.wwd.medcat.services.UserActionAuditIntf;


/** 
* @author jopensourcej
*/


@Service
public class UserActionAuditService implements UserActionAuditIntf {

    @Autowired
    private UserActionAuditRepository auditRepository;

    //@Override
    public void saveUserActionAuditHistory(UserActionAudit actionAudit) {
        auditRepository.save(actionAudit);
    }
}



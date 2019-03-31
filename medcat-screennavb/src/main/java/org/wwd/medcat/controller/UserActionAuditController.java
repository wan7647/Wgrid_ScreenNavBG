package org.wwd.medcat.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wwd.medcat.model.document.UserActionAudit;
import org.wwd.medcat.services.UserActionAuditIntf;

/** 
* @author jopensourcej
*/

@Controller()
public class UserActionAuditController {
    private static final Logger logger = LoggerFactory.getLogger(UserActionAuditController.class);

    @Autowired
    private UserActionAuditIntf auditIntf;

    @RequestMapping(value="/insertUserAction",method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserActionAudit saveUserActionAuditData(@Valid @RequestBody UserActionAudit actionAudit) throws Exception{
        logger.debug("Enter : UserActionAuditController : saveUserActionAuditData");
        auditIntf.saveUserActionAuditHistory(actionAudit);
        logger.debug("Exit : UserActionAuditController : saveUserActionAuditData");
        return  actionAudit;
    }
}

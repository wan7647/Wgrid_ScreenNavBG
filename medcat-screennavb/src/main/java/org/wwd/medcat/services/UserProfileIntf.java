package org.wwd.medcat.services;

import org.springframework.stereotype.Component;
import org.wwd.medcat.model.document.UserProfile;


/** 
* @author jopensourcej
*/


@Component
public interface UserProfileIntf {

    public void saveUserProfile(UserProfile profile);
}

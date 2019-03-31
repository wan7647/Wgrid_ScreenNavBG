package org.wwd.medcat.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wwd.medcat.model.document.UserProfile;
import org.wwd.medcat.repository.UserProfileRepository;
import org.wwd.medcat.services.UserProfileIntf;

/** 
* @author jopensourcej
*/


@Service
public class UserProfileService implements UserProfileIntf {

    @Autowired
    private UserProfileRepository profileRepository;

    //@Override
    public void saveUserProfile(UserProfile profile) {
        profileRepository.save(profile);
    }

}



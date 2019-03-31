package org.wwd.medcat.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wwd.medcat.model.document.CityStateCountryPinCode;
import org.wwd.medcat.model.document.GenericDropDown;
import org.wwd.medcat.model.document.ScreenLabelMapping;
import org.wwd.medcat.model.document.UserProfile;
import org.wwd.medcat.repository.ScreenLabelMappingRepository;
import org.wwd.medcat.services.CityStateCountyPinCodeIntf;
import org.wwd.medcat.services.GenericDropDownIntf;
import org.wwd.medcat.services.UserProfileIntf;

/** 
* @author jopensourcej
*/


@Controller()
public class UserProfileController {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileController.class);

    @Autowired
    private UserProfileIntf profileIntf;

    @Autowired
    private GenericDropDownIntf genericDropDownIntf;

    @Autowired
    private CityStateCountyPinCodeIntf codeIntf;

    @Autowired
    private ScreenLabelMappingRepository repository;

    @RequestMapping(value="/createUserProfile",method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserProfile saveProfileData(@Valid @RequestBody UserProfile profile) throws Exception{
        logger.debug("Enter : UserProfileController : saveProfileData");
        profileIntf.saveUserProfile(profile);
        logger.debug("Exit : UserProfileController : saveProfileData");
        return  profile;
    }

    @RequestMapping(value="/user/{id}",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<GenericDropDown> getCommonData(@PathVariable("id") String id) throws Exception{
        logger.debug("Enter : UserProfileController : getCommonData");
        List<GenericDropDown> genericDropDown;
        if(id == null){
            throw new Exception("its does not exists");
        }
        genericDropDown = genericDropDownIntf.fetchDropDownDetailsByTypeId(id);
        logger.debug("Exit : UserProfileController : getCommonData");
        return genericDropDown;
    }

    @RequestMapping(value="/userAddress/{id}",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<CityStateCountryPinCode> getAddressCoordinates(@PathVariable(name = "id", required = true) int id) throws Exception{
        logger.debug("Enter : UserProfileController : getAddressCoordinates");
        List<CityStateCountryPinCode> codes = null;
        if(id == 0){
            throw new Exception("its does not exists");
        }
        codes = codeIntf.fetchCountryDetails(id);

        logger.debug("Exit : UserProfileController : getAddressCoordinates");
        return codes;
    }
}

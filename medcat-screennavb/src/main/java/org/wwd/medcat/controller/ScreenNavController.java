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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wwd.medcat.model.document.CityStateCountryPinCode;
import org.wwd.medcat.model.document.GenericDropDown;
import org.wwd.medcat.model.document.ScreenAction;
import org.wwd.medcat.model.document.ScreenLabelMapping;
import org.wwd.medcat.model.document.UserProfile;
import org.wwd.medcat.repository.ScreenActionRepository;
import org.wwd.medcat.repository.ScreenLabelMappingRepository;
import org.wwd.medcat.services.CityStateCountyPinCodeIntf;
import org.wwd.medcat.services.GenericDropDownIntf;
import org.wwd.medcat.services.ScreenActionIntf;
import org.wwd.medcat.services.ScreenLabelMappingIntf;
import org.wwd.medcat.services.UserProfileIntf;
/** 
* @author jopensourcej
*/


@Controller()
public class ScreenNavController {
    private static final Logger logger = LoggerFactory.getLogger(ScreenNavController.class);
    String navId;

    @Autowired
    private ScreenLabelMappingIntf mappingIntf;
    

    @Autowired
    private ScreenActionIntf actionIntf;

    @RequestMapping(value="/screenMappingDetails/{screenId}",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<ScreenLabelMapping> getScreenMappingDetails(@PathVariable(name = "screenId", required = true) int screenId) throws Exception{
        logger.debug("Enter : ScreenNavController : getScreenMappingDetails");
        List<ScreenLabelMapping> screenLabelMappings = mappingIntf.fetchScreenMappingDetails(screenId);
        logger.debug("Exit : ScreenNavController : getScreenMappingDetails");
        return screenLabelMappings;
    }
    
    @RequestMapping(value="/screenAction/{actionName}",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<ScreenLabelMapping> getScreenNavigationId(@PathVariable(name = "actionName", required = true) int actionId) throws Exception{
        logger.debug("Enter : ScreenNavController : getScreenNavigationId");
        ScreenAction action = actionIntf.fetchNavigationId(actionId);
        navId = action.getNavScreens();
        navId = navId.substring(0, navId.length() - 2);
        int navIdInt = Integer.parseInt(navId);
        List<ScreenLabelMapping> screenLabelMappings = getScreenMappingDetails(navIdInt);
        logger.debug("Exit : ScreenNavController : getScreenNavigationId");
        return screenLabelMappings;
    }
}

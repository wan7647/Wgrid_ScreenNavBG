package org.wwd.medcat.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wwd.medcat.model.document.ScreenLabelMapping;
import org.wwd.medcat.repository.ScreenLabelMappingRepository;
import org.wwd.medcat.services.ScreenLabelMappingIntf;


/** 
* @author jopensourcej
*/


@Service
public class ScreenLabelMappingService implements ScreenLabelMappingIntf {

    @Autowired
    ScreenLabelMappingRepository mappingRepository;

    //@Override
    public List<ScreenLabelMapping> fetchScreenMappingDetails(int screenId) {
        return mappingRepository.findByScreenID(screenId);
    }
}

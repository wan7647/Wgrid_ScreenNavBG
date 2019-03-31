package org.wwd.medcat.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wwd.medcat.model.document.GenericDropDown;
import org.wwd.medcat.repository.GenericDropDownRepository;
import org.wwd.medcat.services.GenericDropDownIntf;


/** 
* @author jopensourcej
*/

@Service
public class GenericDropDownService implements GenericDropDownIntf {

    @Autowired
    private GenericDropDownRepository downRepository;

    //@Override
    public List<GenericDropDown> fetchDropDownDetailsByTypeId(String typeId) {
        return downRepository.findAllByTypeId(typeId);
    }
}



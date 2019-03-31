package org.wwd.medcat.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.wwd.medcat.model.document.GenericDropDown;


/** 
* @author jopensourcej
*/

@Component
public interface GenericDropDownIntf {

    public List<GenericDropDown> fetchDropDownDetailsByTypeId(String typeId);
}

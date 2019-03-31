package org.wwd.medcat.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.wwd.medcat.model.document.CityStateCountryPinCode;

/** 
* @author jopensourcej
*/

@Component
public interface CityStateCountyPinCodeIntf {

    public List<CityStateCountryPinCode> fetchCountryDetails(int appId);
}

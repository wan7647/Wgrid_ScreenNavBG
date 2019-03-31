package org.wwd.medcat.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wwd.medcat.model.document.CityStateCountryPinCode;
import org.wwd.medcat.repository.CityStateCountryPinCodeRepository;
import org.wwd.medcat.services.CityStateCountyPinCodeIntf;
/** 
* @author jopensourcej
*/
@Service
public class CityStateCountryPincodeService implements CityStateCountyPinCodeIntf {

    @Autowired
    private CityStateCountryPinCodeRepository repository;

    //@Override
    public List<CityStateCountryPinCode> fetchCountryDetails(int appId) {
        return repository.findByAppID(appId);
    }
}



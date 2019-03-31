package org.wwd.medcat.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.wwd.medcat.model.document.CityStateCountryPinCode;

/** 
* @author jopensourcej
*/

public interface CityStateCountryPinCodeRepository extends MongoRepository<CityStateCountryPinCode,String> {
    @Query(value = "{ 'appid' : ?0}")
    List<CityStateCountryPinCode> findByAppID(int appId);
}

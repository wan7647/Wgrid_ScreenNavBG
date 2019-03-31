package org.wwd.medcat.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.wwd.medcat.model.document.GenericDropDown;

/** 
* @author jopensourcej
*/

public interface GenericDropDownRepository extends MongoRepository<GenericDropDown,String>,GenericDropDownRepositoryCustom {


}

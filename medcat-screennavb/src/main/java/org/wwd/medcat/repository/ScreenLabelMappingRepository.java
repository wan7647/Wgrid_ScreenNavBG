package org.wwd.medcat.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.wwd.medcat.model.document.ScreenLabelMapping;

/** 
* @author jopensourcej
*/

public interface ScreenLabelMappingRepository extends MongoRepository<ScreenLabelMapping,String> {
    @Query(value = "{'screenId' : ?0}")
    List<ScreenLabelMapping> findByScreenID(int screenId);
}

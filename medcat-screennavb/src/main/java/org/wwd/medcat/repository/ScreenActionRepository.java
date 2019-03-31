package org.wwd.medcat.repository;

/** 
* @author jopensourcej
*/
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.wwd.medcat.model.document.ScreenAction;

public interface ScreenActionRepository extends MongoRepository<ScreenAction,Integer> {
    
	@Query(value = "{'actionId' : ?0}")
    ScreenAction findByActionId(int actionId);
}

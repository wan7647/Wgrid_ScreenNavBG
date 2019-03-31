package org.wwd.medcat.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.wwd.medcat.model.document.GenericDropDown;

/** 
* @author jopensourcej
*/
public class GenericDropDownRepositoryImpl implements GenericDropDownRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

    //@Override
    public List<GenericDropDown> findAllByTypeId(String typeId) {
        String[] values =  typeId.split(",");
        ArrayList<String> listOfTypeID = new ArrayList(Arrays.asList(values));
        List<Integer> listOfAge = new ArrayList<Integer>();
        for(String s : listOfTypeID)
            listOfAge.add(Integer.valueOf(s));
//        listOfAge.add(1);
//        listOfAge.add(2);
//        listOfAge.add(3);


        Query query = new Query(Criteria.where("typeId").in(listOfAge));
        List<GenericDropDown> userTest3 = mongoTemplate.find(query, GenericDropDown.class);
        for(GenericDropDown g : userTest3){
            System.out.println(".."+g.getAppId());
        }
        return userTest3;
    }
}

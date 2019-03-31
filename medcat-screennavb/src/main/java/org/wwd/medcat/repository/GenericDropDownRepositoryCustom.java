package org.wwd.medcat.repository;

import java.util.List;

import org.wwd.medcat.model.document.GenericDropDown;

/** 
* @author jopensourcej
*/

public interface GenericDropDownRepositoryCustom {

    List<GenericDropDown> findAllByTypeId(String typeId);
}

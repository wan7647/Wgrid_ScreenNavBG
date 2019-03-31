package org.wwd.medcat.services;

import java.util.List;

import org.wwd.medcat.model.document.ScreenLabelMapping;

/** 
* @author jopensourcej
*/

public interface ScreenLabelMappingIntf {
    public List<ScreenLabelMapping> fetchScreenMappingDetails(int screenId);
}

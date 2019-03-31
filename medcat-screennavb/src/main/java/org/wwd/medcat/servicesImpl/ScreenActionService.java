package org.wwd.medcat.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wwd.medcat.model.document.ScreenAction;
import org.wwd.medcat.repository.ScreenActionRepository;
import org.wwd.medcat.services.ScreenActionIntf;


/** 
* @author jopensourcej
*/


@Service
public class ScreenActionService implements ScreenActionIntf {

    @Autowired
    ScreenActionRepository actionRepository;

    //@Override
    public ScreenAction fetchNavigationId(int actionId) {
        return actionRepository.findByActionId(actionId);
    }
}

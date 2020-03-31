package jrout.tutorial.spring.service.impl;

import jrout.tutorial.spring.dao.IDVDDao;
import jrout.tutorial.spring.dao.impl.DVDDaoImpl;
import jrout.tutorial.spring.domain.Actor;
import jrout.tutorial.spring.service.IDVDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
    Service class is dependent on which class ?
 */
//@Service(value = "mydvd") // the main object to give this annotation ..so that spring can create this object
@Service // the main object to give this annotation ..so that spring can create this object
//@Component
//@Scope("prototype") // singleton
public class DVDServiceImpl implements IDVDService {

    public DVDServiceImpl(){
        System.out.println("DVD Service Object is created...");
    }

    @Autowired
    //@Resource
    private IDVDDao idvdDao; // this object is injected into the dvdserviceimpl

    @Override
    public Actor getActorDetail(int actorId) {
        // we are exposing the dao impl classs..
        Actor actorDetail = idvdDao.getActorDetail(actorId);
        return actorDetail;
    }
}

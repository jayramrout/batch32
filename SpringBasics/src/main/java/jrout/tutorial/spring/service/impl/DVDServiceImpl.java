package jrout.tutorial.spring.service.impl;

import jrout.tutorial.spring.dao.impl.DVDDaoImpl;
import jrout.tutorial.spring.domain.Actor;
import jrout.tutorial.spring.service.IDVDService;

public class DVDServiceImpl implements IDVDService {
    @Override
    public Actor getActorDetail(int actorId) {
        Actor actorDetail = new DVDDaoImpl().getActorDetail(actorId);
        return actorDetail;
    }
}

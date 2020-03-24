package jrout.tutorial.db.postgres.service.impl;

import jrout.tutorial.db.postgres.domain.Actor;
import jrout.tutorial.db.postgres.service.IDVDService;
import jrout.tutorial.db.postgres.dao.IDVDDao;
import jrout.tutorial.db.postgres.dao.impl.DVDDaoImpl;

import java.sql.Date;
import java.util.List;

public class DVDServiceImpl implements IDVDService {

    @Override
    public Actor getActorDetail(int actorId) {
        IDVDDao dao = new DVDDaoImpl();
        Actor actorDetail = dao.getActorDetail(actorId);
        actorDetail.setClientRequestDate(new Date(new java.util.Date().getTime()));
        return actorDetail;
    }

    @Override
    public Actor getActorDetail(String firstName, String lastName) {
        return null;
    }

    @Override
    public Actor[] getActors(String firstName) {
        IDVDDao idvdDao = new DVDDaoImpl();
        return idvdDao.getActors(firstName);
    }

    @Override
    public List<Actor> getActors_v2(String firstName) {
        IDVDDao idvdDao = new DVDDaoImpl();
        return idvdDao.getActors_v2(firstName);
    }

    @Override
    public List<String> getUniqueFirstNames() {
        return null;
    }


}

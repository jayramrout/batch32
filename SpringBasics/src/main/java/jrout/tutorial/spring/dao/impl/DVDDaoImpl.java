package jrout.tutorial.spring.dao.impl;

import jrout.tutorial.spring.dao.IDVDDao;
import jrout.tutorial.spring.domain.Actor;

public class DVDDaoImpl implements IDVDDao {

    @Override
    public Actor getActorDetail(int actorId) {
        // talk to database and retrieve information accordingly..
        Actor actor = new Actor();
        actor.setActorId(actorId);
        actor.setFirstName("Tom");
        actor.setLastName("Hank");
        return actor;
    }
}

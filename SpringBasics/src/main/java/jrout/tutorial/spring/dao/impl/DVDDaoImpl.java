package jrout.tutorial.spring.dao.impl;

import jrout.tutorial.spring.dao.IDVDDao;
import jrout.tutorial.spring.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Map;

@Component
public class DVDDaoImpl implements IDVDDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Actor getActorDetail(int actorId) {

        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap("select * from actor where actor_id = " + actorId);
        // 1 min
        // talk to database and retrieve information accordingly..
        Actor actor = new Actor();
        actor.setActorId(actorId);
        actor.setLastName((String)stringObjectMap.get("last_name"));
        actor.setFirstName((String)stringObjectMap.get("first_name"));
//        actor.setLastUpdatedDate( stringObjectMap.get("last_update"));
        return actor;
    }
}

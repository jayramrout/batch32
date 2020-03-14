package jrout.tutorial.db.postgres.service.dao;

import jrout.tutorial.db.postgres.Actor;

import java.util.List;

public interface IDVDDao {
    Actor getActorDetail(int actorId);
    Actor getActorDetail(String firstName , String lastName);
    Actor[] getActors(String firstName);
    String getFilm(String title);

    List<Actor> getActors_v2(String firstName);
}

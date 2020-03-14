package jrout.tutorial.db.postgres.service;

import jrout.tutorial.db.postgres.Actor;

import java.util.List;

public interface IDVDService {
    Actor getActorDetail(int actorId);
    Actor getActorDetail(String firstName , String lastName);
    Actor[] getActors(String firstName);
    List<Actor> getActors_v2(String firstName);
    List<String> getUniqueFirstNames();

}

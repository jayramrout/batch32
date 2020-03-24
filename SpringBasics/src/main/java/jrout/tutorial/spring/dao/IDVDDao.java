package jrout.tutorial.spring.dao;


import jrout.tutorial.spring.domain.Actor;

public interface IDVDDao {
    Actor getActorDetail(int actorId);
}

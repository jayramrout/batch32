package jrout.tutorial.db.postgres;

import jrout.tutorial.db.postgres.domain.Actor;
import jrout.tutorial.db.postgres.service.IDVDService;
import jrout.tutorial.db.postgres.service.impl.DVDServiceImpl;

import java.util.List;

public class DatabaseDriverClient {
    public static void main(String[] args) {
        IDVDService idvdService = new DVDServiceImpl();
        Actor actorDetail = idvdService.getActorDetail(55);
        System.out.println(actorDetail);

        /*Actor[] eds = idvdService.getActors("Nick");
        for(Actor actor : eds) {
            System.out.println(actor);
        }*/


        List<Actor> actorList = idvdService.getActors_v2("Nick");
        for(Actor actor : actorList) {
            System.out.println(actor);
        }
    }
}

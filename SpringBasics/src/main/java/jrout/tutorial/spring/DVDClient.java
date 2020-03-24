package jrout.tutorial.spring;

import jrout.tutorial.spring.domain.Actor;
import jrout.tutorial.spring.service.IDVDService;
import jrout.tutorial.spring.service.impl.DVDServiceImpl;

public class DVDClient {
    public static void main(String[] args) {
        IDVDService service = new DVDServiceImpl();
        Actor actorDetail = service.getActorDetail(100);
        System.out.println(actorDetail);
    }
}

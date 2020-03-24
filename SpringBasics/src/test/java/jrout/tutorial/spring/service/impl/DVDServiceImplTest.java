package jrout.tutorial.spring.service.impl;

import jrout.tutorial.spring.domain.Actor;
import jrout.tutorial.spring.service.IDVDService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class DVDServiceImplTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getActorDetail() {
        IDVDService service = new DVDServiceImpl();
        Actor actorDetail = service.getActorDetail(100);
        System.out.println(actorDetail);
    }
}
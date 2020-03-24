package jrout.tutorial.spring.dao.impl;

import jrout.tutorial.spring.dao.IDVDDao;
import jrout.tutorial.spring.domain.Actor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class DVDDaoImplTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("AFter");
    }

    @Test
    public void getActorDetail() {
        IDVDDao dao = new DVDDaoImpl();
        Actor actorDetail = dao.getActorDetail(200);
        assertNotNull(actorDetail);
        assertEquals(actorDetail.getFirstName(), "Tom");
    }
}
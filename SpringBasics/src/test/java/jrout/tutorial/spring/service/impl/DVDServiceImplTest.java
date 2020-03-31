package jrout.tutorial.spring.service.impl;

import jrout.tutorial.spring.config.AppConfig;
import jrout.tutorial.spring.domain.Actor;
import jrout.tutorial.spring.service.IDVDService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class DVDServiceImplTest {

    IDVDService service = null;
    /*@Before
    public void setUp() throws Exception {
        service = new DVDServiceImpl(); // I am able to see the implementation class..
    }*/

    /*@After
    public void tearDown() throws Exception {
        service = null;
    }*/

    @Test
    public void getActorDetail() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        IDVDService service = applicationContext.getBean(IDVDService.class);
        Actor actorDetail = service.getActorDetail(101);
        System.out.println(actorDetail);
//        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testObjectCreation() {
        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(AppConfig.class);
//        IDVDService bean = applicationContext.getBean(IDVDService.class);
//        System.out.println(applicationContext.getBean("DVDServiceImpl"));

        IDVDService bean1 = applicationContext.getBean(IDVDService.class);
        System.out.println(bean1.hashCode());

        IDVDService bean2 = applicationContext.getBean(IDVDService.class);
        System.out.println(bean2.hashCode());

    }
}
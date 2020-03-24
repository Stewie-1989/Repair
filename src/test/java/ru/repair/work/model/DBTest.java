package ru.repair.work.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DBTest {
    private EntityManagerFactory factory;
    private EntityManager manager;

    @Before
    public void connect() {
        factory = Persistence.createEntityManagerFactory("TestPersistenceUnit");
        manager = factory.createEntityManager();
    }

    @After
    public void close() {
        if (manager != null) {
            manager.close();
        }
        if (factory != null) {
            factory.close();
        }
    }
    @Test
    public void createDB() throws InterruptedException {
        User user = new User();
        user.setLogin("test-login");
        user.setLogin("test-password");
        user.setMail("test-mail");
        user.setKayCode("test-kayCode");

        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
        Thread.sleep(120000);

    }
}

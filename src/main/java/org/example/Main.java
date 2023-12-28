package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();

        configuration.configure();
        configuration.addAnnotatedClass(Writer.class);

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Writer writer = new Writer();

            writer.setFirstName("tttttttt");
            writer.setLastName("tttttttt111");

            session.persist(writer);
            transaction.commit();
        }
    }
}
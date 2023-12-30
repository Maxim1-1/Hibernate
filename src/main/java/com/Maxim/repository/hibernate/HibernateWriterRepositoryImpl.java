package com.Maxim.repository.hibernate;

import com.Maxim.dbutils.Hibernate_utils.HibernateConnector;
import com.Maxim.model.Label;
import com.Maxim.model.Post;
import com.Maxim.model.Writer;
import com.Maxim.repository.WriterRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.List;

public class HibernateWriterRepositoryImpl implements WriterRepository {

    HibernateConnector hibernateConnector = new HibernateConnector();
    @Override
    public Writer getById(Integer id) {
        Session session = hibernateConnector.getSessionFactory().openSession();
        return session.get(Writer.class,id);
    }

    @Override
    public List<Writer> getAll() {

        Session session = hibernateConnector.getSessionFactory().openSession();
        return session.createQuery("from Writer").getResultList();
    }

    @Override
    public Writer save(Writer writer)  {
        Session session = hibernateConnector.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(writer);
        transaction.commit();
        return writer;
    }

    @Override
    public Writer update(Writer writer) {
        Session session = hibernateConnector.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(writer);
        transaction.commit();
        return writer;

    }

    @Override
    public void deleteById(Integer id) {
        Session session = hibernateConnector.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Writer writer = session.get(Writer.class,id);
        session.remove(writer);
        transaction.commit();

    }
}

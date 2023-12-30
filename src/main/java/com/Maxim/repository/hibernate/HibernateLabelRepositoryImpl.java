package com.Maxim.repository.hibernate;

import com.Maxim.dbutils.Hibernate_utils.HibernateConnector;
import com.Maxim.model.Label;
import com.Maxim.repository.LabelRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class HibernateLabelRepositoryImpl implements LabelRepository {

    HibernateConnector hibernateConnector = new HibernateConnector();
    @Override
    public Label getById(Integer id) {

        Session session = hibernateConnector.getSessionFactory().openSession();
        return session.get(Label.class,id);
    }

    @Override
    public List<Label> getAll() {
        Session session = hibernateConnector.getSessionFactory().openSession();
        return session.createQuery("from Label").getResultList();
    }

    @Override
    public Label save(Label label)  {
        Session session = hibernateConnector.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(label);
        transaction.commit();
        return label;
    }

    @Override
    public Label update(Label label) {
        Session session = hibernateConnector.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(label);
        transaction.commit();
        return label;
    }

    @Override
    public void deleteById(Integer id) {
        Session session = hibernateConnector.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Label label = session.get(Label.class,id);
        session.remove(label);
        transaction.commit();
    }
}

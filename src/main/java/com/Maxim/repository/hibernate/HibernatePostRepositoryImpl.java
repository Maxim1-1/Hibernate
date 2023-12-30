package com.Maxim.repository.hibernate;

import com.Maxim.dbutils.Hibernate_utils.HibernateConnector;
import com.Maxim.model.Label;
import com.Maxim.model.Post;
import com.Maxim.model.Writer;
import com.Maxim.repository.PostRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.List;

public class HibernatePostRepositoryImpl implements PostRepository {

    HibernateConnector hibernateConnector = new HibernateConnector();

    @Override
    public Post getById(Integer integer) {
        return null;
    }

    @Override
    public List<Post> getAll() {
        Session session = hibernateConnector.getSessionFactory().openSession();
        return session.createQuery("from Post").getResultList();
//        Configuration configuration = new Configuration();
//
//        configuration.configure();
//        configuration.addAnnotatedClass(Label.class);
//        configuration.addAnnotatedClass(Writer.class);
//        configuration.addAnnotatedClass(Post.class);
//
//        configuration.buildSessionFactory();
//
//        try (
//                Session session = configuration.buildSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//
//            return session.createQuery("from Post").getResultList();
////          return   session.createQuery("SELECT p FROM Post p  join fetch p.labels").getResultList();
//
//        }


    }

    @Override
    public Post save(Post post) {
        Session session = hibernateConnector.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(post);
        transaction.commit();

        return post;
    }

    @Override
    public Post update(Post post) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}

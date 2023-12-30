package com.Maxim.repository.hibernate;

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
    @Override
    public Writer getById(Integer integer) {
        return null;
    }

    @Override
    public List<Writer> getAll() {
        return null;
    }

    @Override
    public Writer save(Writer writer)  {
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
//                Session session = configuration.buildSessionFactory().openSession())
//        {
//            Transaction transaction = session.beginTransaction();
//            session.persist(writer);
//
//            transaction.commit();
//        }
        return writer;
    }

    @Override
    public Writer update(Writer writer) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}

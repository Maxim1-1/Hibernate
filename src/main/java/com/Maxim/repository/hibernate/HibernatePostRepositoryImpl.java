package com.Maxim.repository.hibernate;

import com.Maxim.dbutils.Hibernate_utils.HibernateConnector;
import com.Maxim.model.Post;
import com.Maxim.model.PostStatus;
import com.Maxim.repository.PostRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;



import java.util.List;

public class HibernatePostRepositoryImpl implements PostRepository {

    HibernateConnector hibernateConnector = new HibernateConnector();

    @Override
    public Post getById(Integer id) {
        Session session = hibernateConnector.getSessionFactory().openSession();
        return session.get(Post.class,id);
    }

    @Override
    public List<Post> getAll() {
        Session session = hibernateConnector.getSessionFactory().openSession();
        return session.createQuery("select p from Post p left join fetch p.labels left join fetch p.writer").getResultList();
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
        Session session = hibernateConnector.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(post);
        transaction.commit();
        return post;
    }

    @Override
    public void deleteById(Integer id) {
        Session session = hibernateConnector.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Post postFromDB = session.get(Post.class,id);
        postFromDB.setPostStatus(PostStatus.DELETED);
        transaction.commit();
    }
}

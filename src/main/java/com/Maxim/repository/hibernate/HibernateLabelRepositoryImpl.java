package com.Maxim.repository.hibernate;

import com.Maxim.model.Label;
import com.Maxim.model.Post;
import com.Maxim.model.Writer;
import com.Maxim.repository.LabelRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HibernateLabelRepositoryImpl implements LabelRepository {
    @Override
    public Label getById(Integer integer) {
        return null;
    }

    @Override
    public List<Label> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Label save(Label label)  {
//        Session session = hibernateConnector.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(label);
//        transaction.commit();

        return label;
    }

    @Override
    public Label update(Label label) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}

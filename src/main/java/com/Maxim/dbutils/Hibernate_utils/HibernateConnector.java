package com.Maxim.dbutils.Hibernate_utils;

import com.Maxim.model.Label;
import com.Maxim.model.Post;
import com.Maxim.model.Writer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnector {



    private final Configuration configuration = new Configuration();


    public Configuration getConfiguration() {
        configuration.configure();
        configuration.addAnnotatedClass(Label.class);
        configuration.addAnnotatedClass(Writer.class);
        configuration.addAnnotatedClass(Post.class);
        return configuration;
    }


    public SessionFactory getSessionFactory() {
       return getConfiguration().buildSessionFactory();
    }
}

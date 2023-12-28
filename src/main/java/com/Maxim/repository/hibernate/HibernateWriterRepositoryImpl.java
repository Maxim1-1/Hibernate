package com.Maxim.repository.hibernate;

import com.Maxim.model.Writer;
import com.Maxim.repository.WriterRepository;

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
    public Writer save(Writer writer) throws SQLException {
        return null;
    }

    @Override
    public Writer update(Writer writer) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}

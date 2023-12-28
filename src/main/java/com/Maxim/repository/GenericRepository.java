package com.Maxim.repository;

import java.sql.SQLException;
import java.util.List;

public interface GenericRepository <T,ID> {
    T getById(ID id);

    List<T> getAll();

    T save(T t) throws SQLException;

    T update(T t);

    void deleteById(ID id);


}
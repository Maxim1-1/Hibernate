package com.Maxim.repository.hibernate;

import com.Maxim.model.Post;
import com.Maxim.repository.PostRepository;

import java.sql.SQLException;
import java.util.List;

public class HibernatePostRepositoryImpl implements PostRepository {
    @Override
    public Post getById(Integer integer) {
        return null;
    }

    @Override
    public List<Post> getAll() {
        return null;
    }

    @Override
    public Post save(Post post) throws SQLException {
        return null;
    }

    @Override
    public Post update(Post post) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}

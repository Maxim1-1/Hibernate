package com.Maxim.service;


import com.Maxim.model.Post;
import com.Maxim.repository.PostRepository;
import com.Maxim.repository.hibernate.HibernatePostRepositoryImpl;
import com.Maxim.repository.jdbc.JDBCPostRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class PostService {

    private final PostRepository jdbc = new HibernatePostRepositoryImpl();

    public Post savePost(Post post) {
            return jdbc.save(post);
    }

    public Post getPostById(Integer postId) {
        return jdbc.getById(postId);
    }

    public List<Post> getAllPosts() {
        return jdbc.getAll();
    }

    public Post updatePostById(Post post) {
        return jdbc.update(post);
    }

    public void deletePostById(Integer id) {
        jdbc.deleteById(id);
    }
}

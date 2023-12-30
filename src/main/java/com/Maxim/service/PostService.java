package com.Maxim.service;


import com.Maxim.model.Post;
import com.Maxim.repository.PostRepository;
import com.Maxim.repository.hibernate.HibernatePostRepositoryImpl;

import java.util.List;

public class PostService {

    private final PostRepository hibernatePostRepository = new HibernatePostRepositoryImpl();

    public Post savePost(Post post) {
            return hibernatePostRepository.save(post);
    }

    public Post getPostById(Integer postId) {
        return hibernatePostRepository.getById(postId);
    }

    public List<Post> getAllPosts() {
        return hibernatePostRepository.getAll();
    }

    public Post updatePostById(Post post) {
        return hibernatePostRepository.update(post);
    }

    public void deletePostById(Integer id) {
        hibernatePostRepository.deleteById(id);
    }
}

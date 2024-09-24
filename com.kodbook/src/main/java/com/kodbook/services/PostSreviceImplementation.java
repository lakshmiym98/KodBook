package com.kodbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodbook.entities.Post;
import com.kodbook.repositories.PostRepository;

@Service
public class PostSreviceImplementation implements PostService{
	
	@Autowired
	PostRepository repo;

	@Override
	public void createPost(Post post) {
		repo.save(post);
		
	}

}

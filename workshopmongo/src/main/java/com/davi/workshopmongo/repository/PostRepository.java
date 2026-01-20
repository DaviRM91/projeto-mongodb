package com.davi.workshopmongo.repository;

import com.davi.workshopmongo.domain.Post;
import com.davi.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}

package com.davi.workshopmongo.services;

import com.davi.workshopmongo.domain.Post;
import com.davi.workshopmongo.domain.User;
import com.davi.workshopmongo.dto.UserDTO;
import com.davi.workshopmongo.repository.PostRepository;
import com.davi.workshopmongo.repository.UserRepository;
import com.davi.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findBiTitle(String text){
        return repo.findByTitle(text);
    }

}
package com.davi.workshopmongo.dto;

import com.davi.workshopmongo.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String Name;

    public AuthorDTO() {
    }

    public AuthorDTO(User obj){
        id = obj.getId();
        Name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

package com.example.CRUD.domain.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotFound extends Error {
    private Integer cod;

    public NotFound(String messagem){
        super(messagem);
        this.setCod(404);
    }
}

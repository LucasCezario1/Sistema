package com.sistemadocmob.doc.infrastructure.exception;

public class SistemaNotFoundException extends  RuntimeException{
    private Long id;

    public SistemaNotFoundException(Long id) {
        super(String.format("Id do Usuario %s encontrado", id));
        this.id = id ;
    }
}

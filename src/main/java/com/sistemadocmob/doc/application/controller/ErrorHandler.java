package com.sistemadocmob.doc.application.controller;

import com.sistemadocmob.doc.infrastructure.exception.SistemaNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(SistemaNotFoundException.class)
    public ResponseEntity<String> sistemaNotFound(SistemaNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}

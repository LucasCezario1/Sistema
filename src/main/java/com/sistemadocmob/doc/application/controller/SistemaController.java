package com.sistemadocmob.doc.application.controller;


import com.sistemadocmob.doc.domain.model.Sistema;
import com.sistemadocmob.doc.domain.service.SistemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SistemaController {
    private  final SistemaService sistemaService;

    // pega todos os usuarios
    @GetMapping("/sistema")
    public ResponseEntity<List<Sistema>> getAllUser(){
        return  ResponseEntity.ok(sistemaService.getAllUsers());
    }

    // pega 1 usuario
    @GetMapping("/sistema/{id}")
    public ResponseEntity<Sistema> getUserById(@PathVariable Long id){
        return  ResponseEntity.ok(sistemaService.getUserById(id));
    }

    // deletar usaurio do sistema pelo  login
    @DeleteMapping("/sistema/{login}")
    public  ResponseEntity deleteUserByLogin(@PathVariable String login){
        sistemaService.deleteUserByLogin(login);
        return  ResponseEntity.ok().build();
    }

    //Criar Usaurio
    @PostMapping("/sistema")
    public  ResponseEntity<Sistema> saveUser(@RequestBody Sistema sistema){
        return  ResponseEntity.ok(sistemaService.saveUser(sistema));
    }
}

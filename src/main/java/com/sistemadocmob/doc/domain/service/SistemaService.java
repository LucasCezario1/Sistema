package com.sistemadocmob.doc.domain.service;

import com.sistemadocmob.doc.domain.model.Sistema;

import java.util.List;

public interface SistemaService {
        List<Sistema> getAllUsers(); // todos os usuarios

        Sistema getUserById(Long id); // pega 1 usaurio pelo id

        void deleteUserByLogin(String login); // deletar usuario pelo login

        Sistema saveUser(Sistema sistema); // Criar Usaurio

        Sistema updateUserById(Long id ,Sistema sistema); // atualizar os dados dos ususarios

}

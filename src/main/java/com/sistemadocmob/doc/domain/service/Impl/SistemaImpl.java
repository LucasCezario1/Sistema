package com.sistemadocmob.doc.domain.service.Impl;

import com.sistemadocmob.doc.domain.model.Sistema;
import com.sistemadocmob.doc.domain.service.SistemaService;
import com.sistemadocmob.doc.infrastructure.repository.SistemaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SistemaImpl implements SistemaService {
    private  final SistemaRepository sistemaRepository;

    // pega todos os usuarios do sistema
    @Override
    public List<Sistema> getAllUsers() {
        return sistemaRepository.findAll();
    }

    // pega 1 usasurio
    @Override
    public Sistema getUserById(Long id) {
        return sistemaRepository.findById(id).orElseThrow(RuntimeException:: new);
    }

    @Transactional
    @Override
    public void deleteUserByLogin(String login) {
        sistemaRepository.deleteByLogin(login);
    }

    //Ciar Usaurio e como regra de negocio pode ter 1 Usuario com o mesmo login
    @Override
    public Sistema saveUser(Sistema sistema) {
     if (sistemaRepository.existsByLogin(sistema.getLogin())){
         throw new RuntimeException();
     }
     sistema.setCreatedDate(LocalDateTime.now());
     sistema.setUpdatedDate(LocalDateTime.now());

     return  sistemaRepository.save(sistema);
    }


}

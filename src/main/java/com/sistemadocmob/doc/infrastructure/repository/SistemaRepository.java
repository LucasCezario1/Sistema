package com.sistemadocmob.doc.infrastructure.repository;

import com.sistemadocmob.doc.domain.model.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SistemaRepository extends JpaRepository<Sistema, Long> {
    List<Sistema> findAll();  // listar todos banco
    Optional<Sistema> findById(Long id); // achar pelo Id banco
    long deleteByLogin(String login); // deletar pelo login
    Boolean existsByLogin(String login); // Verificar se o login ja existe no sistema


}

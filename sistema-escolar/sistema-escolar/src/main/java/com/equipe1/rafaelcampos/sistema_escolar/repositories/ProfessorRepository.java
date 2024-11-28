package com.equipe1.rafaelcampos.sistema_escolar.repositories;


import com.equipe1.rafaelcampos.sistema_escolar.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

package com.equipe1.rafaelcampos.sistema_escolar.repositories;


import com.equipe1.rafaelcampos.sistema_escolar.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {


}

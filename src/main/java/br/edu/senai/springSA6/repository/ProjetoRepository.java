package br.edu.senai.springSA6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.senai.springSA6.orm.Projeto;


@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer>{

}

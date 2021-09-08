package br.com.guilherme.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);
	//findByCursoNome ->Curso (entidade de relacionamento) + Nome (nome é o atributo 
	//dentro dessa entidade de relacionamento)

}
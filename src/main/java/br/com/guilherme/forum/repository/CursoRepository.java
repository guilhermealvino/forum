package br.com.guilherme.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);	

}

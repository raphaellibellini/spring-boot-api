package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	//Curso é a entidade de relacionamento e Nome o atributo dentro dessa entidade ("_" separa o relacionamento)
	List<Topico> findByCurso_Nome(String nomeCurso);
	
}


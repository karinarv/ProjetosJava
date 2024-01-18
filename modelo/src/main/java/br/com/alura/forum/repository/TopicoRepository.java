package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico,Long> {

    List<Topico> findByCursoNome(String nomeCurso);

}

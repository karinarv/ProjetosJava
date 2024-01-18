package br.com.alura.forum.controller;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.modelo.TopicoDTO;
import br.com.alura.forum.repository.TopicoRepository;

import java.util.List;

@RestController

public class TopicosController {

    //Injestão da interface Repository
    @Autowired
    public TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    // Quer devolver uma lista de tópicos -> public ? lista()
    public List<TopicoDTO> lista(){
        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDTO.converter(topicos);
    }

    @RequestMapping("/topicos")
    public List<TopicoDTO> lista(String nomeCurso){
        List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
        return TopicoDTO.converter(topicos);
    }
}

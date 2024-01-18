package br.com.alura.forum.modelo;

import java.util.List;
import java.util.stream.Collectors;

public class TopicoDTO {
    private long id;
    private String titulo;
    private String Message;
    private LocalDateTimeTime dataCriacao;

    public TopicoDTO(long id, String titulo, String message, LocalDateTimeTime dataCriacao) {
        this.id = id;
        this.titulo = titulo;
        Message = message;
        this.dataCriacao = dataCriacao;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMessage() {
        return Message;
    }

    public LocalDateTimeTime getDataCriacao() {
        return dataCriacao;
    }

    //Metodo que vai optar entre a classe Topico e a TopicoDTO
    public static List<TopicoDTO> converter(List<Topico> topicos){
        return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
    }
}

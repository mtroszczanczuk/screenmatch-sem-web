package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}

/*

ctrl + alt + o = atualiza os imports

record -> É um tipo novo do java. A classe é imutável, não tem sets e nem gets, já vem com equals e hash code, tem 1 construtor com todos os parâmetros e o atributo é referenciado pelo seu proprio nome

@JsonAlias -> vai usar o nome entre aspas para desserializar um objeto, mas ao serializar vai usar o nome do atributo.
              Pode receber uma lista de nomes para dar match. ex: @JsonAlias({"Title","Titulo"})

@JsonProperty -> usa o nome entre aspas tanto para desserializar quanto para serializar. ex: @JsonProperty("imdbVotes") String votos

*/
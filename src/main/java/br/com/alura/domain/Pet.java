package br.com.alura.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private String nome;
    private String tipo;
    private String raca;
    private Integer idade;
    private String cor;
    private Float peso;

}

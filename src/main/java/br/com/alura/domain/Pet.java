package br.com.alura.domain;

import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
public class Pet {

    @Getter
    private Long id;

    @Getter
    @Setter
    @NonNull
    private String nome;

    @Getter
    @Setter
    @NonNull
    private String tipo;

    @Getter
    @Setter
    @NonNull
    private String raca;

    @Getter
    @Setter
    @NonNull
    private Integer idade;

    @Getter
    @Setter
    @NonNull
    private String cor;

    @Getter
    @Setter
    @NonNull
    private Float peso;

}

package br.com.alura.domain;

import lombok.*;

import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
public class Abrigo {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NonNull
    private String nome;

    @Getter
    @Setter
    @NonNull
    private String telefone;

    @Getter
    @Setter
    @NonNull
    private String email;

    @Getter
    @Setter
    private List<Pet> pets;

    @Override
    public String toString() {
        return """
                     "id":%s,"nome":"%s","telefone":"%s","email":"%s"
                     """.formatted(this.id, this.nome, this.telefone, this.email);
    }


}

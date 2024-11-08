package com.ouahidi.livreapp.dtos;

import lombok.*;

// Les données que vais envoyer pour créer un livre
// dans la base

@AllArgsConstructor @NoArgsConstructor          @ToString
@Getter @Setter @Builder
public class LivreRequeteDTO {
    private String titre;
    private String auteur;
    private Double prix;
}

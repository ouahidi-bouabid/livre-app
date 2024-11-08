package com.ouahidi.livreapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Getter @Setter
public class Livre {
    @Id //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idLivre;
    private String titre;
    private String auteur;
    private Double prix;

}

package com.ouahidi.livreapp;

import com.ouahidi.livreapp.entities.Livre;
import com.ouahidi.livreapp.repositories.LivreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class LivreAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivreAppApplication.class, args);
    }

    @Bean
    CommandLineRunner start(LivreRepository livreRepository) {
        return args -> {
            Livre l1 = Livre.builder()
                    .idLivre(UUID.randomUUID().toString())
                    .auteur("Logan")
                    .titre("Appredre Spring boot")
                    .prix(800.0)
                    .build();
            livreRepository.save(l1);
            Livre l2 = Livre.builder()
                    .idLivre(UUID.randomUUID().toString())
                    .auteur("Pyjolle")
                    .titre("Les réseaux ")
                    .prix(150.0)
                    .build();
            livreRepository.save(l2);
            Livre l3 = Livre.builder()
                    .idLivre(UUID.randomUUID().toString())
                    .auteur("Tanabaum")
                    .titre("La Compilation ")
                    .prix(250.0)
                    .build();
            livreRepository.save(l3);

            List<Livre> liste  = livreRepository.findAll();

            for (Livre l: liste){
                System.out.println("Titre:  "+l.getTitre());

            }
        };
    }
}
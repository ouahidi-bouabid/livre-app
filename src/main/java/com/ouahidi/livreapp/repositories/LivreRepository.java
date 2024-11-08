package com.ouahidi.livreapp.repositories;

import com.ouahidi.livreapp.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Ce n'est pas toujours necessaire
// pour avoir le controlleur par defautl

@RepositoryRestResource

public interface LivreRepository extends JpaRepository  <Livre, String>{
// Je peux ajouter des méthodes. Exemple
    public Livre  findLivreByIdLivre(String  id);
    // L'appel se fera par:

public Livre findLivreByAuteur(String auteur);
//http://localhost:8083/livres/search/findLivreByAuteur?auteur=Logan

public Livre findLivreByOrderByAuteur();
 
}

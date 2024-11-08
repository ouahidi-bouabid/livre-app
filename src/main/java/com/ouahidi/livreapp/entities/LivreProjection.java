package com.ouahidi.livreapp.entities;


import org.springframework.data.rest.core.config.Projection;

// Les projections ne marchent que pour le controlleur
// par defaut
@Projection(types=Livre.class, name="p1")
public interface  LivreProjection {
    public Integer  getIdLivre();
    public Double getPrix();

    //http://localhost:8083/livres?projection=p1
   //  noter p1 et non pas "p1"
    // Ca marche pour le controleur par defaut
    // ou projection pour un livre
    // projection sur un livre d'ID 1
    // http://localhost:8083/livres/1?projection=p1
}

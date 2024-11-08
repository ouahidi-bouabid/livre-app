package com.ouahidi.livreapp.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(types = Livre.class, name="p2")
public interface LivreProjection2 {
    public String getTitre();
    public String getAuteur();

}

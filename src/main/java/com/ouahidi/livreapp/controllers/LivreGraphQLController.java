package com.ouahidi.livreapp.controllers;

import com.ouahidi.livreapp.dtos.LivreReponseDTO;
import com.ouahidi.livreapp.dtos.LivreRequeteDTO;
import com.ouahidi.livreapp.entities.Livre;
import com.ouahidi.livreapp.services.ServiceInterface;

import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller

public class LivreGraphQLController {

    public LivreGraphQLController(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    ServiceInterface serviceInterface;

    @QueryMapping("allLivres")
    public List<Livre> allLivres() {
        return serviceInterface.getall();
    }
    @QueryMapping("livreById")
    public Livre livreById (@Argument String idLivre){
        return serviceInterface.getById(idLivre);

    }


    @MutationMapping("addLivre")
    public  Livre  addLivre(@Argument LivreRequeteDTO livre) {
         return serviceInterface.creat(livre);
    }
}



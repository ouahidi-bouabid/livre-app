package com.ouahidi.livreapp.controllers;

import com.ouahidi.livreapp.dtos.LivreReponseDTO;
import com.ouahidi.livreapp.dtos.LivreRequeteDTO;
import com.ouahidi.livreapp.entities.Livre;
import com.ouahidi.livreapp.repositories.LivreRepository;
import com.ouahidi.livreapp.services.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LivreController {


    public LivreController(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    private final ServiceInterface serviceInterface;



    @GetMapping("/livres")
    public List<Livre> livres(){
        return serviceInterface.getall();

    }

    @GetMapping("livres/{id}")
    public Livre unLivre(@PathVariable  String  id )
    {
        return serviceInterface.getById(id);
    }

    @PostMapping("/livres")
    public Livre  creer(@RequestBody LivreRequeteDTO l)
    {
       return serviceInterface.creat(l);

    }

    @PutMapping("/livres/{id}")
    public  Livre update(@PathVariable String id, @RequestBody LivreRequeteDTO l){
        return serviceInterface.updateById(id,l);
    }
    @DeleteMapping("/livres/{id}")
public void  supprimeById(@PathVariable String id)
    {
        serviceInterface.deteteById(id);
    }


}



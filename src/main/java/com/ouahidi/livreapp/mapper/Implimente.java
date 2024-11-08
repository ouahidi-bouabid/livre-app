package com.ouahidi.livreapp.mapper;

import com.ouahidi.livreapp.dtos.LivreReponseDTO;
import com.ouahidi.livreapp.dtos.LivreRequeteDTO;
import com.ouahidi.livreapp.entities.Livre;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class Implimente implements LivreInterfaceMapper{
    @Override
    public LivreReponseDTO livre2LivreReponseDTO(Livre l) {
        LivreReponseDTO x = new LivreReponseDTO();
        //x.setAuteur(l.getAuteur());
        //x.setTitre(l.getTitre());
        // On peut faire ceco
        BeanUtils.copyProperties(l, x);
        return x;
    }

    @Override
    public Livre livreRequeteDTO2Livre(LivreRequeteDTO l) {
        Livre x  = new Livre();
        BeanUtils.copyProperties(l,x);
        x.setIdLivre(UUID.randomUUID().toString());
        return x;

    }
}




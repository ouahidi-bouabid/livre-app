package com.ouahidi.livreapp.mapper;

import com.ouahidi.livreapp.dtos.LivreReponseDTO;
import com.ouahidi.livreapp.dtos.LivreRequeteDTO;
import com.ouahidi.livreapp.entities.Livre;



public interface LivreInterfaceMapper {

    public LivreReponseDTO livre2LivreReponseDTO(Livre l);
    public Livre livreRequeteDTO2Livre(LivreRequeteDTO l);
}

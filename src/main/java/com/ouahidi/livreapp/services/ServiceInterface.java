package com.ouahidi.livreapp.services;

import com.ouahidi.livreapp.dtos.LivreReponseDTO;
import com.ouahidi.livreapp.dtos.LivreRequeteDTO;
import com.ouahidi.livreapp.entities.Livre;

import java.util.List;

public interface ServiceInterface {
    public List<Livre> getall();
    public Livre getById(String id);
    public Livre creat(LivreRequeteDTO l);
    public   Livre  updateById(String id, LivreRequeteDTO l);
    public void deteteById(String id);

}

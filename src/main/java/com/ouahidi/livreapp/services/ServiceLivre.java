package com.ouahidi.livreapp.services;

import com.ouahidi.livreapp.dtos.LivreReponseDTO;
import com.ouahidi.livreapp.dtos.LivreRequeteDTO;
import com.ouahidi.livreapp.entities.Livre;
import com.ouahidi.livreapp.mapper.LivreInterfaceMapper;
import com.ouahidi.livreapp.repositories.LivreRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ServiceLivre implements ServiceInterface{

   LivreInterfaceMapper livreInterfaceMapper;
    LivreRepository livreRepository;

    public ServiceLivre(LivreRepository livreRepository, LivreInterfaceMapper livreInterfaceMapper) {
        this.livreRepository = livreRepository;
        this.livreInterfaceMapper=livreInterfaceMapper;
    }

    @Override
    public List<Livre> getall() {
       return livreRepository.findAll();

    }

    @Override
    public Livre getById(String id) {
        return livreRepository.findById(id).get();

    }

    @Override
    public Livre  creat(LivreRequeteDTO l) {

        Livre x=new Livre();
        x= livreInterfaceMapper.livreRequeteDTO2Livre(l);
        x.setIdLivre(UUID.randomUUID().toString());
        livreRepository.save(x);
        return x;
    }

    @Override
    public Livre updateById(String id, LivreRequeteDTO l) {
        Livre x = livreInterfaceMapper.livreRequeteDTO2Livre(l);
        x.setIdLivre(id);
         return livreRepository.save(x);
    }
    @Override
    public void deteteById(String id) {
        livreRepository.deleteById(id);

    }
}

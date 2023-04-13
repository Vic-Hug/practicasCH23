package com.crud.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.app.entity.Torre;
import com.crud.app.repository.TorreRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TorreService {

    @Autowired
    TorreRepository torreRepository;

    //Por defecto el repositorio al extender de JPA trae el metodo por defecto
    public List<Torre> listaTorre(){
        return  torreRepository.findAll();
    }

    public Optional<Torre> getTorre(int idTorre){
        return  torreRepository.findById(idTorre);
    }

    public Optional<Torre> getByNombreTorre(String nombreTorre){
        return torreRepository.findByNombreTorre(nombreTorre);
    }

    public void saveTorre(Torre torre){
        torreRepository.save(torre);
    }

    public void deleteTorre(int idTorre){
        torreRepository.deleteById(idTorre);
    }

    public boolean existsByIdTorre(int idTorre){
        return torreRepository.existsById(idTorre);
    }

    public boolean existsByNombreTorre(String nombreTorre){
        return torreRepository.existsByNombreTorre(nombreTorre);
    }


}

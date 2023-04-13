package com.crud.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.app.entity.Torre;

@Repository
public interface TorreRepository  extends JpaRepository<Torre, Integer> {
        // Con @Repository le indico los metodos principales select

    //Convención sobre convicción
    Optional<Torre> findByNombreTorre(String nombreTorre);

    boolean existsByNombreTorre(String nombreTorre);

}

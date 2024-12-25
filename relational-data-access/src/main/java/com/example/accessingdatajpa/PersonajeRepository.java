package com.example.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

public interface PersonajeRepository extends CrudRepository<Personaje, String> {
    //extiende de JpaRepository para tener implementadas CRUD

}
package com.example.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

public interface HabilidadRepository extends CrudRepository<Habilidad, String> {
    //extiende de JpaRepository para tener implementadas CRUD
}

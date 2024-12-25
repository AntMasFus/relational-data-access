package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    @Autowired
    private HabilidadRepository habilidadRepository;

    public Personaje guardarPersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public List<Personaje> obtenerTodosLosPersonajes() {
        return (List<Personaje>) personajeRepository.findAll();
    }

    public void agregarHabilidadAPersonaje(String personajeNombre, String habilidadNombre) {
        Personaje personaje = personajeRepository.findById(personajeNombre).orElseThrow();
        Habilidad habilidad = habilidadRepository.findById(habilidadNombre).orElseThrow();
        personaje.getHabilidades().add(habilidad);
        personajeRepository.save(personaje);
    }

    public void eliminarHabilidadDePersonaje(String personajeNombre, String habilidadNombre) {
        Personaje personaje = personajeRepository.findById(personajeNombre).orElseThrow();
        Habilidad habilidad = habilidadRepository.findById(habilidadNombre).orElseThrow();
        personaje.getHabilidades().remove(habilidad);
        personajeRepository.save(personaje);
    }
}

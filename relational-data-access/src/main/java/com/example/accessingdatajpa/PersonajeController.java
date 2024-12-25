package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @PostMapping
    public Personaje crearPersonaje(@RequestBody Personaje personaje) {
        return personajeService.guardarPersonaje(personaje);
    }

    @GetMapping
    public List<Personaje> obtenerPersonajes() {
        return personajeService.obtenerTodosLosPersonajes();
    }

    @PostMapping("/{personajeNombre}/habilidad/{habilidadNombre}")
    public void agregarHabilidad(@PathVariable String personajeNombre, @PathVariable String habilidadNombre) {
        personajeService.agregarHabilidadAPersonaje(personajeNombre, habilidadNombre);
    }

    @DeleteMapping("/{personajeNombre}/habilidad/{habilidadNombre}")
    public void eliminarHabilidad(@PathVariable String personajeNombre, @PathVariable String habilidadNombre) {
        personajeService.eliminarHabilidadDePersonaje(personajeNombre, habilidadNombre);
    }
}

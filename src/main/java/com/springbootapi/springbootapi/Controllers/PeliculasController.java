package com.springbootapi.springbootapi.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapi.springbootapi.Entities.Peliculas;
import com.springbootapi.springbootapi.Services.PeliculasService;

@RestController
@RequestMapping(path = "/api/peliculas")
public class PeliculasController {

    @Autowired
    private PeliculasService peliculasService;
    

    @GetMapping("/getAllPeliculas")
    public List<Peliculas> getAll(){
        return peliculasService.getPeliculas();
    }



    @GetMapping("/getPeliculaById/{id}")
    public Optional<Peliculas> obtenerPeliculaPorId(@PathVariable Long id){
        return peliculasService.obtenerPeliculaPorId(id);
    }



    @PostMapping("/postPelicula")
    public Peliculas guardarPelicula(@RequestBody Peliculas pelicula){
        return peliculasService.agregarPelicula(pelicula);
    }



    @DeleteMapping("/deletePeliculaById/{id}")
    public String eliminarPelicula(@PathVariable Long id){
        Boolean eliminar = peliculasService.eliminarPelicula(id);
        if(eliminar){
            return "La pelicula con id " + id + " se elimino correctamente";
        }else{
            return "La pelicula con id " + id + " no se pudo eliminar";
        }
    } 



    @PutMapping("actualizarPelicula/{id}")
    public Peliculas actualizarPelicula(@PathVariable Long id, @RequestBody Peliculas pelicula){
        return peliculasService.actualizarPelicula(id, pelicula);
    }
    
}

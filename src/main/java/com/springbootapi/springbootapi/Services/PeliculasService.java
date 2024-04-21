package com.springbootapi.springbootapi.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapi.springbootapi.Entities.Peliculas;
import com.springbootapi.springbootapi.Repositories.PeliculaRepository;

@Service
public class PeliculasService {

    @Autowired
    PeliculaRepository peliculaRepository;


    
    //Obtener todas las peliculas GET
    public List<Peliculas> getPeliculas(){
        return peliculaRepository.findAll();
    }

    //Obtener peliculas¿ por id GET
    public Optional<Peliculas> obtenerPeliculaPorId(Long id){
        return peliculaRepository.findById(id);
    }


    //Agregar pelicula POST
    public Peliculas agregarPelicula(Peliculas pelicula){
        return peliculaRepository.save(pelicula);
    }


    //Eliminar pelicula DELETE
    public Boolean eliminarPelicula(Long id){
        try{
            peliculaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }


    //Actualizar pelicula PUT
    public Peliculas actualizarPelicula(Long id, Peliculas pelicula){
        Peliculas pelicula_encontrada = peliculaRepository.findById(id).get();
        pelicula_encontrada.setNombrePelicula(pelicula.getNombrePelicula());
        pelicula_encontrada.setGenero(pelicula.getGenero());
        pelicula_encontrada.setDuracion(pelicula.getDuracion());
        pelicula_encontrada.setAñoLanzamiento(pelicula.getAñoLanzamiento());
        pelicula_encontrada.setSinopsis(pelicula.getSinopsis());
        pelicula_encontrada.setNombreDirector(pelicula.getNombreDirector());
        return peliculaRepository.save(pelicula_encontrada);
    }
}

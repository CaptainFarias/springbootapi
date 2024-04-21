package com.springbootapi.springbootapi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Peliculas")
public class Peliculas {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPelicula;
    private String nombrePelicula;
    private String genero;
    private String duracion;
    private int añoLanzamiento;
    private String sinopsis;
    private String nombreDirector;
    public Long getIdPelicula() {
        return idPelicula;
    }
    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }
    public String getNombrePelicula() {
        return nombrePelicula;
    }
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }
    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public String getNombreDirector() {
        return nombreDirector;
    }
    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }


}

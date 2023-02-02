/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeliculaEnt;

/**
 *
 * @author Hp
 */
public class Pelicula {
    
    private String Pelicula;
    private String Director;
    private Double Duracion;

    public Pelicula() {
    }

    public Pelicula(String Pelicula, String Director, Double Duracion) {
        this.Pelicula = Pelicula;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Pelicula=" + Pelicula + ", Director=" + Director + ", Duracion=" + Duracion + '}';
    }
    
    
    
    
    
    
    
}

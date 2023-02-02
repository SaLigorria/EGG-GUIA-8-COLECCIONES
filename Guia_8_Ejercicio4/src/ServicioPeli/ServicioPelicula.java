/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioPeli;

import PeliculaEnt.Pelicula;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class ServicioPelicula {
    Scanner leer = new Scanner(System.in);
    Pelicula peli = new Pelicula(); 
    
    List<Pelicula> listapelicula = new ArrayList<>() ; 
    
 public Pelicula crearPelicula() {
        Pelicula nuevaPelicula = new Pelicula();
        System.out.println("Ingrese titulo: ");
        nuevaPelicula.setPelicula(leer.next());
        System.out.println("Ingrese director: ");
        nuevaPelicula.setDirector(leer.next());
        System.out.println("Ingrese duracion: ");
        nuevaPelicula.setDuracion(leer.nextDouble());

//        listapelicula.add(peli);
        return nuevaPelicula;

    }

    public void agregarPelicula() {
        int opcion = 1;
        do {
            listapelicula.add(crearPelicula());
            System.out.println("Quiere agregar otra pelicula, (1 / si) (2 / no)");
            opcion = leer.nextInt();

        } while (opcion == 1);

    }

    public void mostrarPelicula() {
        for (Pelicula peli2 : listapelicula) {
            System.out.println(peli2);
        }
    }
 
    public void mostrarmayor1Hora() { 
        for (Pelicula peli2 : listapelicula) {
            if(peli2.getDuracion()>1 ){
                System.out.println("Titulo " + peli2.getPelicula());
            }
            
        }
    }
    
    }

        
        
  
    


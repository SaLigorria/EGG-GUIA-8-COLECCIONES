/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class ServiceRaza {
    Scanner leer = new Scanner(System.in, "UTF-8").useDelimiter("\n");
    
//IMPORTO LA ENTIDAD RAZA 
    Raza ra = new Raza();
//CREANDO EL ARRAYLIST DE RAZA 
    List<Raza> raza = new ArrayList<>();

    
// METODO PARA INGRESAR UNA RAZA Y SE GUARDA EN LA VARIABLE AUX 
     public Raza ingresarRaza() {

        System.out.println("Escriba la raza: ");
        String aux = leer.next();

        return new Raza(aux);
    }


    public void generaRaza() {
        System.out.println("Cantidad a ingresar de razas: ");
        int n = leer.nextInt(), i;
        for (i = 0; i < n; i++) {
            raza.add(ingresarRaza());
        }

    }
    
    public void mostrarRaza(){
        for (Raza aux : raza) {
            System.out.println(aux.getRaza());
            
        }
    }

     public void eliminarRaza (){
        System.out.println("Ingresar la raza a borrar");
        Raza r1 = new Raza();
        r1.setRaza(leer.next());
        Raza rasaEncontrada= null;
        Iterator<Raza> it = this.raza.iterator();
        while(it.hasNext() && rasaEncontrada==null){
           Raza r= it.next();
            if (r.getRaza().equalsIgnoreCase(r1.getRaza()))
            {
                rasaEncontrada=r;
                raza.remove(r);
            }
        }
            
    }

    
    
    
    
    
    
}

    
    
    
    
    
    


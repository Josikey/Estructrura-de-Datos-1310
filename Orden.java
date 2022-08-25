
package com.mycompany.arreglo;

import java.util.ArrayList;


public class Orden {
    
    private ArrayList<Nombre> nombres;
    
    public Orden (){
        nombres = new ArrayList<>();
    }
    
    public void eliminarNombre(int cod){
        for (int i = 0; i < nombres.size(); i++) {
            if (cod == nombres.get(i).getCod()) {
                nombres.remove(i);
            }
            
        }
    }
    
    public void agregarNombre(int cod, String persona){
        Nombre nuevo = new Nombre(cod,persona);
        nombres.add(nuevo); 
    }
    
    public void verNombre(){
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i).getPersona());
            
        }
    }
    
}

package com.mycompany.arreglo;

public class Arreglo {

   public static void main(String[] args) 
    {
     Orden nuevo = new Orden();   
     nuevo.agregarNombre(1, "Juan");
     nuevo.agregarNombre(2, "Jose");
     nuevo.agregarNombre(3, "Angelica");
     nuevo.agregarNombre(4, "Ilikey"); 
     nuevo.agregarNombre(5, "Camila");
     nuevo.agregarNombre(6, "Andrea");
     nuevo.agregarNombre(7, "Nicolas");
     nuevo.agregarNombre(8, "Sofia");
     nuevo.agregarNombre(9, "Brayan");
     nuevo.agregarNombre(10, "Ozzo");
     
     //En eliminarNombre se elige la posicion de la lista que se desea eliminar 
     nuevo.eliminarNombre(1);
     
     
     nuevo.verNombre();
     
        System.out.println(nuevo.toString());
     
}
}


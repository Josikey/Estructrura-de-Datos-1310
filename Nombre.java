package com.mycompany.arreglo;

public class Nombre {
    private int cod;
    private String persona;
    
    public Nombre(int cod, String persona){
        this.cod = cod;
        this.persona = persona;
        
    }

    @Override
    public String toString() {
        return "Nombre{" + "cod=" + cod + ", persona=" + persona + '}';
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getCod() {
        return cod;
    }

    public String getPersona() {
        return persona;
    }

    

   
    
    
}

package com.mycompany.figurasgeometricas;

public class FigurasGeometricas {
   private String nombre;
   private String color;
   
     //Complejidad temporal; Tiempo Constante O(1) 
   public FigurasGeometricas(String nombre, String color){
       this.nombre = nombre;
       this.color = color;
   }
     //Complejidad temporal: Tiempo Constante O(1) 
    public String getNombre() {
        return nombre;
    }
      //Complejidad temporal: Tiempo Constante O(1) 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      //Complejidad temporal: Tiempo Constante O(1) 
    public String getColor() {
        return color;
    }
      //Complejidad temporal: Tiempo Constante O(1) 
    public void setColor(String color) {
        this.color = color;
    }
   
   
}

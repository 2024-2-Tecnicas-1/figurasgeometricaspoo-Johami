package com.mycompany.figurasgeometricas;
class Circulo extends FigurasGeometricas{
    private double radio;
    
      //Complejidad temporal: Tiempo Constante O(1) 
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
         //Complejidad temporal: Tiempo Constante O(1) 
        public double obtenerArea() {
        return Math.PI * (radio * radio);
    }

          //Complejidad temporal: Tiempo Constante O(1) 
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    } 
    
}

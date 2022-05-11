/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author DET PC
 */
public class Sueldo {
    private double sueldo;
    private double sueldototal;
     public Sueldo(double s) {
        sueldo = s;
}
     public void establecerSueldo(double s){
     sueldo = s;
     }
     public double obtenerSueldo(){
     return sueldo;
     }
     public double obtenerSueldototal(){
     sueldototal = ((sueldo*20)/100)+sueldo;
     return sueldototal;
     }
      public String toString() {
        String cadena = String.format("Sueldo: %s\nSueldo total: %s",sueldo,sueldototal);
        return cadena;
    }
}
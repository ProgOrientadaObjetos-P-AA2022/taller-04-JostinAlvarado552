/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author DET PC
 */
public class Nombre {
        private String nombre;
        private String cedula;

    public Nombre(String n, String c) {
        nombre = n;
        cedula= c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }
    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String toString() {
        String cadena = String.format("Profesor:\nNombre: %s\nCedula:%s\n", nombre,cedula);
        return cadena;
    }
}


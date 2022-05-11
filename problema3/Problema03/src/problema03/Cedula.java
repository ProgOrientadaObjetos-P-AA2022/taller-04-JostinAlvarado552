/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author DET PC
 */
public class Cedula {
        private String cedula;

    public Cedula(String c) {
        cedula= c;
    }
    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String toString() {
        String cadena = String.format("Cliente:\nCedula:%s\n",cedula);
        return cadena;
    }
}


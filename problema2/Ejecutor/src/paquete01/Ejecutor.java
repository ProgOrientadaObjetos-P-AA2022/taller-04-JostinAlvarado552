/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author DET PC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nombre n1 = new Nombre("René Elizalde", "1150184628");
        Sueldo s1 = new Sueldo(425.00);
        s1.obtenerSueldototal();
        System.out.printf("%s%s", n1,s1);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

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

        Estudiante estudiante1 = new Estudiante("René Elizalde");
        Calificaciones c = new Calificaciones(10.00, 9.50, 8.50);
        c.obtenerPromedio();
        System.out.printf("%s%s", estudiante1, c);

    }
}

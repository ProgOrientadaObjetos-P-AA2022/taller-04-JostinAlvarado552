/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author DET PC
 */
public class Ejecutor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cedula n1 = new Cedula("1150184628");
        Vehiculo v1 = new Vehiculo("Chevrolet", 2012, 15500);
        v1.obtenerValorMatricula();
        System.out.printf("%s%s", n1, v1);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author DET PC
 */
public class Ejecutor11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c = new Cliente("Fabian Guarnizo");
        Banco b = new Banco("Banco del Pichincha", 1250.00);
        b.obtenerComision();
        System.out.printf("%s%s", c, b);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema04;

/**
 *
 * @author DET PC
 */
public class Banco {

    private String nombre;
    private double valorcheque;
    private double comision;

    public Banco(String n, double v) {
        nombre = n;
        valorcheque = v;
    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerValorCheque(double v) {
        valorcheque = v;
    }

    public double obtenerValorCheque() {
        return valorcheque;
    }

    public double obtenerComision() {
        comision = (valorcheque * 0.003);

        return comision;
    }

    public String toString() {
        String cadena = String.format("Nombre del Banco: %s\nValor del Cheque: %.2f\nComision cobrada por el banco: %.2f\n", nombre, valorcheque, comision);
        return cadena;
    }
}

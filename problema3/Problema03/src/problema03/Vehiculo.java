/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author DET PC
 */
public class Vehiculo {

    private String marca;
    private int ano;
    private double valorvehiculo;
    private double valormatricula;

    public Vehiculo(String m, int a, double v) {
        marca = m;
        ano = a;
        valorvehiculo = v;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerAno(int a) {
        ano = a;
    }

    public int obtenerAno() {
        return ano;
    }

    public void establecerValorVehiculo(double v) {
        valorvehiculo = v;
    }

    public double obtenerValorVehiculo() {
        return valorvehiculo;
    }
    public double obtenerValorMatricula() {
        valormatricula=(valorvehiculo*0.002)*(2022-ano);
        
        return valormatricula;
    }


    public String toString() {
        String cadena = String.format("Marca del vehiculo: "
                + "%s\nAno de fabricacion: %d\nValor vehiculo: "
                + "%.2f\nValor Matricula: %.2f",marca
                ,ano
                ,valorvehiculo
                ,valormatricula);
        return cadena;
    }
}

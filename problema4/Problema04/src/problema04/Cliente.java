/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema04;

/**
 *
 * @author DET PC
 */
public class Cliente {
        private String cliente;

    public Cliente(String c) {
        cliente= c;
    }
    public void establecerCliente(String c) {
        cliente = c;
    }

    public String obtenerCliente() {
        return cliente;
    }

    public String toString() {
        String cadena = String.format("Cliente: %s\n",cliente);
        return cadena;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author DET PC
 */
public class Estudiante {
    private String nombre;
    
    public Estudiante (String n){
        nombre = n;
    }
    public void establecerNombre(String n){
    nombre = n;
    }
    public String obtenerNombre(){
    return nombre;
    }
}

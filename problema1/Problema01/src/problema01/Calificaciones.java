/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author DET PC
 */
public class Calificaciones {

    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Calificaciones(double c1,double c2, double c3) {
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;

    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }
     public double obtenerCalificacion2() {
        return calificacion2;
    }
      public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        return promedio;
    }
      public String toString(){
        String cadena = String.format("Estudiante:\nNombre:%s\nCalificacion"
                + " materia1:%.2f\nCalificacion materia2:%.2f\nCalificacion "
                + "materia3:%.2f\nPromedio de calificaciones:%.2f\n",);
          return cadena;
    }
    }


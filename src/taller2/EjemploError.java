/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

public class EjemploError {

    String nombre;

    public static void mostrar() {
    System.out.println(this.nombre); // ERROR (no usar this en static)
    }
}

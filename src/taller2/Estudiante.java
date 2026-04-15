/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

public class Estudiante {
    String nombre;
    int edad;

    // Constructor por defecto
    public Estudiante() {
        this("Sin nombre", 0);
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Laptop", 2500);
        p1.mostrarProducto();

        System.out.println("----------------");

        Estudiante e1 = new Estudiante();
        e1.mostrarEstudiante();

        System.out.println("----------------");

        Estudiante e2 = new Estudiante("Alexander", 21);
        e2.mostrarEstudiante();
    }
}

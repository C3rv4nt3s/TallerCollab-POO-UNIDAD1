/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4;

public class Main {
    public static void main(String[] args) {

        // ESTUDIANTE
        Estudiante e = new Estudiante("Carlos", 20, 4.5);
        e.mostrar();

        System.out.println("----------------");

        // COCHE
        Coche c = new Coche("Toyota", "Corolla", 180);
        c.acelerar(20);
        c.mostrar();
    }
}

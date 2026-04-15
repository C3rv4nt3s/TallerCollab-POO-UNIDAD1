/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

public class Main {
    public static void main(String[] args) {

        // COCHES
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Mazda", "3");

        c1.mostrarCoche();
        c2.mostrarCoche();

        Coche.mostrarContador();

        System.out.println("----------------");

        // MATEMATICAS
        System.out.println("Suma: " + Matematicas.suma(5, 3));
        System.out.println("Resta: " + Matematicas.resta(10, 4));
        System.out.println("Multiplicación: " + Matematicas.multiplicacion(2, 6));
        System.out.println("División: " + Matematicas.division(10, 2));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

public class Coche {
    String marca;
    String modelo;

    static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarContador() {
        System.out.println("Cantidad de coches creados: " + contadorCoches);
    }

    public void mostrarCoche() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
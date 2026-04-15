/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

/**
 *
 * @author Acer
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //LIBRO
        System.out.println("Ingrese título del libro:");
        String titulo = sc.nextLine();

        System.out.println("Ingrese autor:");
        String autor = sc.nextLine();

        System.out.println("Ingrese número de páginas:");
        int paginas = sc.nextInt();
        sc.nextLine();

        Libro libro = new Libro(titulo, autor, paginas);

        //CUENTA
        System.out.println("\nIngrese número de cuenta:");
        String numero = sc.nextLine();

        System.out.println("Ingrese tipo de cuenta:");
        String tipo = sc.nextLine();

        System.out.println("Ingrese saldo:");
        double saldo = sc.nextDouble();
        sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(numero, saldo, tipo);

        // ===== ESTUDIANTE =====
        System.out.println("\nIngrese nombre del estudiante:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese edad:");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese curso:");
        String curso = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // ===== MOSTRAR DATOS =====
        System.out.println("\n--- RESULTADOS ---");

        libro.mostrarLibro();
        System.out.println("------------------");

        cuenta.mostrarCuenta();
        System.out.println("------------------");

        estudiante.mostrarEstudiante();
    }
}

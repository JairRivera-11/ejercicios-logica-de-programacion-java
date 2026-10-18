package com.proyecto4;

import java.util.Scanner;

public class ContadorInteligente {
    static void main() {

        Scanner entradaUsuario = new Scanner(System.in);
        String respuesta;

        System.out.println("=== CONTADOR INTELIGENTE ===\n" +
                            "¡Bienvenido querido usuario!");

        do{
        System.out.println("Por favor intruduce un número entero positivo y mayor que cero");
        int numeroUsuario = entradaUsuario.nextInt();

        while (numeroUsuario <= 0){
            System.out.println("Error: Ingresa un número mayor a 0");
            numeroUsuario = entradaUsuario.nextInt();
        }

        int suma = 0;
        int contadorPares = 0;

        System.out.print("Números: ");
        for (int i = 1; i <= numeroUsuario; i++) {
            System.out.print(i+" ");
            suma += i;
            if (i % 2 == 0) {
                contadorPares++;
                }
            }
        System.out.println();
        System.out.println("La suma total del contador es: " + suma);
        System.out.println("Los números pares del contador son: "+contadorPares);

            System.out.println("¿Deseas repetir? (S/N)");
            respuesta = entradaUsuario.next();
        } while (respuesta.equalsIgnoreCase("S"));
        System.out.println("¡Hasta Pronto!");
        entradaUsuario.close();
    }
}

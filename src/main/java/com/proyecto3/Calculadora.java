package com.proyecto3;

import java.util.Scanner;

public class Calculadora {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.printf("===Calculadora Java ====\n" +
                    "1. Suma\n" +
                    "2. Resta\n" +
                    "3. Multiplicación\n" +
                    "4. División\n" +
                    "5. Salir\n" +
                    "Selecciona una opción:");

                opcion = scanner.nextInt();

                //if (opcion < 1 || opcion > 5) {
                //System.out.println("Por favor ingresa una opción válida");
                //}

                switch (opcion) {
                    case 1:
                        System.out.println("Seleccionaste suma\n" +
                                "Ingresa el primer número a sumar:");
                        double n1 = scanner.nextDouble();
                        System.out.println("Ahora ingresa el segundo número a sumar");
                        double n2 = scanner.nextDouble();
                        double suma = n1 + n2;
                        System.out.println("El resultado de la suma es: "+suma);
                        break;

                    case 2:
                        System.out.println("Seleccionaste resta\n" +
                                "Ingresa el primer número a restar:");
                        double n3 = scanner.nextDouble();
                        System.out.println("Ingresa el segundo número a restar:");
                        double n4 = scanner.nextDouble();
                        double resta = n3 - n4;
                        System.out.println("El resultado de la resta es: "+resta);
                        break;

                    case 3:
                        System.out.println("Seleccionaste multiplicación\n" +
                                "Ingresa el pimer número a multiplicar:");
                        double n5 = scanner.nextDouble();
                        System.out.println("Ingresa el segundo número a multiplicar:");
                        double n6 = scanner.nextDouble();
                        double multiplicacion = n5 * n6;
                        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
                        break;

                    case 4:
                        System.out.println("Seleccionaste división.\n" +
                                "Ingresa el primer número a dividir:");
                        double n7 = scanner.nextDouble();
                        System.out.println("Ingresa el segundo número a dividir:");
                        double n8 = scanner.nextDouble();
                        if (n8 == 0) {
                            System.out.println("Error: división entre cero");
                        } else {
                            double division = n7 / n8;
                            System.out.println("El resultado de la division es: "+division);
                        }
                        break;

                    case 5:
                        System.out.println("¡Vuelve pronto!");
                        break;

                    default:
                        System.out.println("Opción invalida");
                }

        } while (opcion != 5);
    scanner.close();
    }
}

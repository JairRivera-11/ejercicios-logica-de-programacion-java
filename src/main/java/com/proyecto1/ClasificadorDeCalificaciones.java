package com.proyecto1;

import java.util.Scanner;

public class ClasificadorDeCalificaciones {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al evaluador de desempeño!");
        System.out.println("Por favor ingresa la califación del alumno para evaluarlo:");
        int calificacion = scanner.nextInt();

        if(calificacion< 0||calificacion >100) {
            System.out.println("Calificación Inválida");
        } else if(calificacion <=59) {
            System.out.println("Reprobado");
        } else if(calificacion <=79) {
            System.out.println("Aprobado");
        } else if(calificacion <=89) {
            System.out.println("Buen resultado");
        } else {
            System.out.println("Excelente");
        }
    }
}

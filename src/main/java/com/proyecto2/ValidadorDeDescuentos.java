package com.proyecto2;

import java.util.Scanner;

public class ValidadorDeDescuentos {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el total de tu compra:");
        double total = scanner.nextDouble();

        if (total < 0) {
            System.out.println("Este es un dato invalido");
            return;
        }

        //Operador ternario que ayuda a hacer un true o false para ver si aplica descuento
        double porcentajeDescuento = total >= 1000 ? 0.10 : 0.0;
        double descuento = total * porcentajeDescuento;
        double totalDelPago = total - descuento;

        System.out.printf("El precio es: %.2f\n", total);
        System.out.printf("El descuento es:  %.2f\n", descuento);
        System.out.printf("El descuento es:  %.2f\n", totalDelPago);
    }
}


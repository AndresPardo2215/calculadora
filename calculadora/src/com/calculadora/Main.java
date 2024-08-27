package com.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractCalculadora calculadora = new CalculadoraBasica();
        try {
            System.out.println(calculadora.imprimirMenu());
            int opcion = scanner.nextInt();
            System.out.println(calculadora.switchCalculadora(opcion));
        } catch (InputMismatchException e) {
            System.out.println("Opcion no valida");
        }

    }
}
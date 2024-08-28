package com.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractCalculadora calculadora = new CalculadoraCientifica();

            System.out.println(calculadora.imprimirMenu());
        boolean running = true;
        while(running){
            int opcion = 0;
            System.out.println("elige una operacion");
            try{
                opcion = scanner.nextInt();
                if (opcion >=10) {throw new RuntimeException();}
                System.out.println(calculadora.switchCalculadora(opcion));
                running = false;
            } catch (InputMismatchException e) {
                System.out.println("Error caracter");
                scanner.next();
            } catch (RuntimeException e) {
                System.out.println("Opcion no valida en menu");
            }
        }




    }
}
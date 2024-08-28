package com.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AbstractCalculadora calculadora = null;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("¿Qué calculadora te gustaría usar");
        System.out.print("Opciones \n 1.Calculadora Básica \n 2.Calculadora cientifica\n");
        String calculadoraSeleccion = sc.next();
            if(calculadoraSeleccion.equals("1"))
                calculadora = new CalculadoraBasica();
            else if(calculadoraSeleccion.equals("2"))
                calculadora = new CalculadoraCientifica();
            else  {
                System.out.println("Opción no válida");
                System.exit(0);
            }

        int numOpciones = (calculadora instanceof CalculadoraCientifica? 10 : 5);
        System.out.println(calculadora.imprimirMenu());
        boolean running = true;
        while(running){
            int opcion = 0;
            System.out.println("elige una operacion");
            try{
                opcion = sc.nextInt();
                if (opcion >=numOpciones) {throw new RuntimeException();}
                System.out.println(calculadora.switchCalculadora(opcion));
                running = false;
            } catch (InputMismatchException e) {
                System.out.println("Error caracter");
                sc.next();
            } catch (RuntimeException e) {
                System.out.println("Opcion no valida en menu");
            }
        }

    }
}
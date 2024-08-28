package com.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraBasica extends AbstractCalculadora implements Operable {

    @Override
    public double sumar(double x, double y) {
        return x + y;
    }

    @Override
    public double restar(double x, double y) {
        return x - y;
    }

    @Override
    public double dividir(double x, double y) {
        if(y == 0)
        {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return x / y;
    }

    @Override
    public double multiplicar(double x, double y) {
        return x * y;
    }

    @Override
    protected String imprimirMenu() {
        return """
                \n=== calculadora Basica ===
                1. suma
                2. resta
                3. multiplicación
                4. division
                """;
    }

    @Override
    protected double switchCalculadora(int opcion) {
        double resultado= 0;
        boolean running = true;
        System.out.println("ingresa dos numeros");
        while(running) {
            try {
                double x = new Scanner(System.in).nextDouble();
                double y = new Scanner(System.in).nextDouble();
                switch (opcion) {
                    case 1: {
                        resultado = this.sumar(x, y);
                        running = false;
                        break;
                    }
                    case 2: {
                        resultado = this.restar(x, y);
                        running = false;
                        break;
                    }
                    case 3: {
                        resultado = this.multiplicar(x, y);
                        running = false;
                        break;
                    }
                    case 4: {
                        resultado = this.dividir(x, y);
                        running = false;
                        break;
                    }
                    default: {
                        System.out.println("opcion no valida");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un numero valido");
            }  catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        }
        return resultado;
    }
}

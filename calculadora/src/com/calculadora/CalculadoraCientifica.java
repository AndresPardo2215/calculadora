package com.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCientifica extends AbstractCalculadora {

    //potencia,raiz, seno,cos,tang

    public double potencia (double base, double exponente )
    {
        return Math.pow(base,exponente);
    }
    public double raizCuadrada(double a)
    {
        if(a<0)
        {
            throw new ArithmeticException("No se puede calcular la raiz de un numero negativo");
        }
        return Math.sqrt(a);
    }
    public double seno(double anguloRadianes)
    {
        return Math.sin(anguloRadianes);
    }
    public double coseno(double anduloRadianes)
    {
        return Math.cos(anduloRadianes);
    }
    public double tangente(double anduloRadianes)
    {
        return Math.tan(anduloRadianes);
    }

    @Override
    protected String imprimirMenu() {
        return """
                \n=== calculadora Basica ===
                1. suma
                2. resta
                3. multiplicación
                4. division
                5. potencia
                6. raíz cuadrada
                7. seno
                8. coseno
                9. tangente""";
    }

    @Override
    protected double switchCalculadora(int opcion) {
        double resultado= 0;
        boolean running = true;
        boolean running2 = true;
        CalculadoraBasica calc= new CalculadoraBasica();
        if (opcion > 5) running = false;
                else running2 = false;
        while(running) {
            try {
                System.out.println("ingresa dos numeros");
                double x = new Scanner(System.in).nextDouble();
                double y = new Scanner(System.in).nextDouble();
                switch (opcion) {
                    case 1: {
                        resultado = calc.sumar(x, y);
                        running = false;
                        break;
                    }
                    case 2: {
                        resultado = calc.restar(x, y);
                        running = false;
                        break;
                    }
                    case 3: {
                        resultado = calc.multiplicar(x, y);
                        running = false;
                        break;
                    }
                    case 4: {
                        resultado = calc.dividir(x, y);
                        running = false;
                        break;
                    }
                    case 5: {
                        resultado = this.potencia(x, y);
                        running = false;
                        break;
                    }
                    default: {
                        System.out.println("opcion no valida");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa numeros validos");
            }
        }

        while(running2) {
            try {
                System.out.println("ingresa un numero");
                double x = new Scanner(System.in).nextDouble();
                switch (opcion) {
                    case 6: {
                        resultado = this.raizCuadrada(x);
                        running2 = false;
                        break;
                    }
                    case 7: {
                        resultado = this.seno(x);
                        running2 = false;
                        break;
                    }
                    case 8: {
                        resultado = this.coseno(x);
                        running2 = false;
                        break;
                    }
                    case 9: {
                        resultado = this.tangente(x);
                        running2 = false;
                        break;
                    }
                    default: {
                        System.out.println("opcion no valida");
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa numeros validos");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        return resultado;
    }
}

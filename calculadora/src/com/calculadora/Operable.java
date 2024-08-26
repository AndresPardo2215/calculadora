package com.calculadora;

public interface Operable {
    double sumar(double x, double y);
    double sumar(String x, String y);
    double restar(double x, double y);
    double restar(String x, String y);

    double dividir(double x, double y);
    double dividir(String x, String y);
    double multiplicar(double x, double y);
    double multiplicar(String x, String y);
}

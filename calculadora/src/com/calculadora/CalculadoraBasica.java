package com.calculadora;

public class CalculadoraBasica extends abstractCalculadora implements Operable{

    @Override
    public double sumar(double x, double y) {
        return x+y;
    }

    @Override
    public double sumar(String x, String y) {
        return 0;
    }

    @Override
    public double restar(double x, double y) {
        return x-y;
    }

    @Override
    public double restar(String x, String y) {
        return 0;
    }

    @Override
    public double dividir(double x, double y) {
        return x/y;
    }

    @Override
    public double dividir(String x, String y) {
        return 0;
    }

    @Override
    public double multiplicar(double x, double y) {
        return x*y;
    }

    @Override
    public double multiplicar(String x, String y) {
        return 0;
    }

    @Override
    protected String imprimirMenu() {
        return "";
    }
}

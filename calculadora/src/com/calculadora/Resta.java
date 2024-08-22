package com.calculadora;

public class Resta implements  Operacion{
    private double x;
    private double y;

    public Resta (double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double ejecuta() {
        return x - y;
    }

    @Override
    public String toString() {
        return "la resta es: " + this.ejecuta();
    }
}

package com.calculadora;

public class Division implements  Operacion{
    private double x;
    private double y;

    public Division (double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double ejecuta() {
        return x / y;
    }

    @Override
    public String toString() {
        return "la division es: " + this.ejecuta();
    }
}

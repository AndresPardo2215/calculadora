package com.calculadora;

public class Multi implements  Operacion{
    private double x;
    private double y;

    public Multi (double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double ejecuta() {
        return x * y;
    }

    @Override
    public String toString() {
        return "el resultado de la multiplicacion es: " + this.ejecuta();
    }
}
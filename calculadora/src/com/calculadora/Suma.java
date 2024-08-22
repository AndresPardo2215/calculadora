package com.calculadora;

import java.util.ArrayList;
import java.util.List;

public class Suma implements  Operacion{
    private double[] x;
    private String[] y;

    public Suma (double... x) {
        this.x = x;
    }

    public Suma (String... y) {
        List<Double> strList = new ArrayList<Double>();

        for (String str : y){
          strList.add(Double.parseDouble(str));
        }
        strList.toArray();
    }

    @Override
    public double ejecuta() {
        double resultado = 0.0;
        for(double num : this.x){
            resultado += num;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "la suma es: " + this.ejecuta();
    }
}

package com.calculadora;

public abstract class AbstractCalculadora {
    public AbstractCalculadora (){
        imprimirMenu();
    }

    protected abstract String imprimirMenu();

    protected abstract double switchCalculadora(int opcion);
}

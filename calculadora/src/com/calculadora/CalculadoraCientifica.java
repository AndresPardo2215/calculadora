package com.calculadora;

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
}

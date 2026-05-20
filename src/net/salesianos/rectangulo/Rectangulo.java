package net.salesianos.rectangulo;

import net.salesianos.calculo.Calculo;

public class Rectangulo implements Calculo {

    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    };

    @Override
    public double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }


    
}

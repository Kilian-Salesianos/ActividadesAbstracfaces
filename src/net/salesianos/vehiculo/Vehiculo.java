package net.salesianos.vehiculo;

public abstract class Vehiculo {

    protected String color;
    protected int numeroDePuertas;
    protected int numeroDeRuedas;
    protected String modelo;
    protected String matricula;

    public Vehiculo(String color, int numeroDePuertas, int numeroDeRuedas, String modelo, String matricula ) {
        this.color = color;
        this.numeroDePuertas = numeroDePuertas;
        this.numeroDeRuedas = numeroDeRuedas;
        this.modelo = modelo;
        this.matricula = matricula;

    }

    public abstract void arrancar();
    public abstract void pararMotor();
    public abstract void mover();
    
}

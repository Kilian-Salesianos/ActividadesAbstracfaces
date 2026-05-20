package net.salesianos.coche;

import net.salesianos.vehiculo.Vehiculo;

public class Coche extends Vehiculo {

    protected boolean motorEnMarcha;
    protected int litrosDelTanque;

    public Coche(String color, int numeroDePuertas, int numeroDeRuedas, String modelo, String matricula, boolean motorEnMarcha, int litrosDelTanque) {

        super(color, numeroDePuertas,numeroDeRuedas,modelo,matricula);

        this.motorEnMarcha = motorEnMarcha;
        this.litrosDelTanque = litrosDelTanque;
    }

    @Override
    public void arrancar() { 

        if (litrosDelTanque > 0) {

            litrosDelTanque--;
            
            motorEnMarcha = true;

            System.out.println("El coche esta en marcha y listo para conducir");
        } else {
            System.out.println("El coche no puede arrancar... puede que se haya acabado el combustible... o puede que haya una bomba debajo 💡!");

        }


    }

    @Override
    public void pararMotor() {
        motorEnMarcha = false;

        System.out.println("El motor no esta en marcha");
    }

    @Override
    public void mover() {

        if(!motorEnMarcha) {

            System.out.println("El coche no puedes moverse, el motor está apagado");

        } else if (litrosDelTanque <= 0) {
            System.out.println("No tenemos gasofa");
            motorEnMarcha = false;
        } else {

            litrosDelTanque--;

            System.out.println("¡Nos estamos moviendo!");
        }
    }

    public int getlitrosDelTanque() {
        return litrosDelTanque;
    }

    public void setlitrosDelTanque(int litrosDelTanque) {
        this.litrosDelTanque = litrosDelTanque;
    }
    
}

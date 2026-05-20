import java.util.Scanner;

import net.salesianos.circulo.Circulo;
import net.salesianos.coche.Coche;
import net.salesianos.rectangulo.Rectangulo;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\nActividades");
            System.out.println("1. Actividad");
            System.out.println("2. Actividad");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("\n Rectángulo");

                    System.out.print("Introduce la base: ");
                    double base = scanner.nextDouble();

                    System.out.print("Introduce la altura: ");
                    double altura = scanner.nextDouble();

                    Rectangulo rectangulo = new Rectangulo(base, altura);

                    System.out.println("\nDatos del rectángulo:");
                    System.out.println("Base: " + base);
                    System.out.println("Altura: " + altura);
                    System.out.println("Área: " + rectangulo.calcularArea());
                    System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

                    System.out.println("\n Círculo ");

                    System.out.print("Introduce el radio: ");
                    double radio = scanner.nextDouble();

                    Circulo circulo = new Circulo(radio);

                    System.out.println("\nDatos del círculo:");
                    System.out.println("Radio: " + radio);
                    System.out.println("Área: " + circulo.calcularArea());
                    System.out.println("Perímetro: " + circulo.calcularPerimetro());

                    break;

                case 2:

                    Coche coche = new Coche(
                            "Rojo",
                            5,
                            4,
                            "Carta dragón ojos azules",
                            "1234ABC",
                            false,
                            20);

                    System.out.println("\nIntentando mover el coche antes de arrancarlo:");
                    coche.mover();

                    System.out.println("\nArrancando coche:");
                    coche.arrancar();

                    System.out.println("\nMoviendonos con el coche:");
                    coche.mover();
                    coche.mover();
                    coche.mover();

                    System.out.println("\nCombustible restante: "
                            + coche.getlitrosDelTanque() + " litros");

                    coche.setlitrosDelTanque(2);

                    System.out.println("\nCombustible cambiado a 2 litros.");

                    System.out.println("\nMoviendo coche 3 veces más:");
                    coche.mover();
                    coche.mover();
                    coche.mover();

                    System.out.println("\nCombustible final: "
                            + coche.getlitrosDelTanque() + " litros");

                    break;

                case 0:

                    System.out.println("Saliendo de las actividades");
                    break;

                default:

                    System.out.println("Opción no válida.");

            }

        } while (opcion != 0);

        scanner.close();

    }

}
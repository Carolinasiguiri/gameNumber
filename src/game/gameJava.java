package game;

import java.util.Scanner;

public class gameJava {

    private Scanner entrada = new Scanner(System.in);
    private boolean activo = true;


    public void jugar() {

        String nombrejugador = obtenerNombreJugador();

        while (activo) {

            int intentos = 0;
            int min = 0;
            int max = 100;

            int numeroJuego = obtenerNumeroAleatorio(1, 100);

            System.out.printf("%s he escogido un número entre %d y %d, adivínalo... \n", nombrejugador, min, max);
            int numeroJugador;

            do {
                numeroJugador = escogerNumero();
                mensaje(numeroJuego, numeroJugador);
                intentos++;
            } while (numeroJuego != numeroJugador);

            System.out.printf("¡Has ganado! %d", intentos);

            activo = false;

        }

    }

    private int obtenerNumeroAleatorio(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private String obtenerNombreJugador() {

        System.out.println("¿Cómo te llamas?");
        String nombrejugador = entrada.nextLine();
        System.out.printf("Bienvenid@ %s, el juego va a comenzar.\n", nombrejugador);

        return nombrejugador;

    }

    private int escogerNumero() {
        System.out.println("Escoge un número");
        return entrada.nextInt();
    }

    private void mensaje(int numeroJuego, int numeroJugador) {
        if (numeroJuego < numeroJugador) {
            System.out.println("Muy alto, adivina otra vez...");
        } else if (numeroJuego > numeroJugador) {
            System.out.println("Muy bajo, adivina otra vez...");
        }
    }

}

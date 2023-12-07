package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public static void initialice() {
        int nJugadores = 0;
        String name = null;

        // escribe el numero de jugadores (vista)
        Scanner teclado = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        //añadir texto indicando la introduccion de personaje (vista)
        do { //poner texto indicando hasta cuantos jugadores se puede (entre 2-4)
            nJugadores = teclado.nextInt();

        } while (nJugadores <= 1 || nJugadores >= 5);

        for (int i = 1; i <= nJugadores; i++) {
            boolean nombreUnico;
            do {
                nombreUnico = true;
                do {
                    name = teclado.next();
                } while (name == " " || name == null || name == "IA" || name == "ia");
                for (Player player : players) {
                    if (player.getName().equalsIgnoreCase(name)) {
                        nombreUnico = false;
                        System.out.println("El nombre ya está en uso. Por favor, introduce un nombre único.");
                    }
                }
            } while (!nombreUnico);


            players.add(new Player(name, 0));
        }
    }
}

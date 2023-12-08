package Controller;

import View.View;

import Model.Deck;
import Model.Game;

import java.util.Scanner;

public class Controller {
    Game game = new Game();
    View view = new View();

    public void start() { //Aqui se muestra el menú del juego que vamos a seleccionar.
        Scanner teclado = new Scanner(System.in);
        int option =0;
        boolean valid = false;
        view.menuPrincipal();


        while (!valid) {
            System.out.println("indica una opcion valida: ");
            if (teclado.hasNextInt()) {
                option = teclado.nextInt();
                if (option >= 1 && option <= 3) {
                    valid = true;
                } else {
                    valid = false;
                }

            } else {
                System.out.println("Solo es posible introducir los numero validos");
                teclado.next();
                valid = false;
            }
        }


        switch (option) {
            case 1:
                play();
                break;

            case 2:
                System.out.println("estamos en ALPHA");
                break;

            case 3:
                System.out.println("bye bye");
                break;
        }

    }

    public void play() {
        game.addPlayer();
        Deck deck = new Deck();
        deck.crearDeck();
        deck.randomCard();

    }
}

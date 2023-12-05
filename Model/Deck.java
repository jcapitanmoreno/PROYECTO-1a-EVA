package Model;

import java.util.Arrays;

public class Deck {

    private Card[] cards = new Card[52];
    public void crearDeck() {
        int inicio = 0;
        String[] suits = {"Corazones", "Picas", "Treboles", "Diamantes"};
        for (String suit : suits) {
            for (int i = 1; i <= 13; i++) {
               cards[inicio] = new Card(i, suit);
              inicio++;
            }
        }
    }

    @Override
    public String toString() {
        return "Deck{" + "cards=" + Arrays.toString(cards) + '}';
    }
}

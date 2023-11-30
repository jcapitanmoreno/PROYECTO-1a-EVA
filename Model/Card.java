package Model;

import java.util.Objects;

public class Card {
    private int Value;
    private String Suit;

    Card() {
        Value = 0;
        Suit = " ";
    }

    Card(int value, String suit) {
        this.Value = value;
        this.Suit = suit;

    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        this.Value = value;
    }

    public String getSuit() {
        return Suit;
    }

    public void setSuit(String suit) {
        this.Suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Value == card.Value && Objects.equals(Suit, card.Suit);
    }

    @Override
    public String toString() {
        return "Card{" + "value=" + Value + ", suit='" + Suit + '\'' + '}';

    }
}

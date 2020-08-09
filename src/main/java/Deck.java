import java.util.Collections;
import java.util.Stack;

public class Deck {
    final Stack<Card> cards;
    private static final char[] colors = { 'c', 'd', 'h', 's' };

    //Creates a new shuffled Deck with cards from the 4 elements in 'colors' starting from the lowest card value in the deck (e.g. Poker = 0, Skat = 7) up to 14 (Ass)
    Deck(int minvalue)
    {
        cards = new Stack<Card>();
        for (int i = minvalue; i <= 14; i++)
        {
            for (char suit : colors)
            {
                Card toAdd = new Card(suit, i);
                cards.add(toAdd);
            }
        }
        Collections.shuffle(cards);
    }
}
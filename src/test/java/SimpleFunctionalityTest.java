import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class SimpleFunctionalityTest {
    Deck deck;

    @Test
    public void testDeckConstructor52Cards()
    {
        deck = new Deck(2);
        assertEquals(52, deck.cards.size(), "52 Card Deck not constructed properly.");
    }

    @Test
    public void testDeckConstructor32Cards()
    {
        deck = new Deck(7);
        assertEquals(32, deck.cards.size(), "32 Card Deck not constructed properly.");
    }



}

import java.util.ArrayList;
import java.util.List;

public class Player {

    String name;
    List<Card> hand;

    Player(String name)
    {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    void dealCard(Card card)
    {
        this.hand.add(card);
    }

    void resetHand() {
        this.hand = new ArrayList<Card>();
    }

    @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder();
        sb.append(name + " : ");
        for (Card card : hand)
        {
            sb.append(card.toString());
        }
        return sb.toString(); 
    } 

}
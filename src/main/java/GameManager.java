import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class GameManager {

    private Deck deck;
    private List<Player> players;
    private Ruleset rules;

    private static String[] defaultNames = {"Player", "Computer", "Bob", "Alice", "C3PO", "Darth Vader", "Bambi", "Aladin", "Fred Feuerstein", "Dagobert Duck"};

    GameManager()
    {
        rules = new ColorScore();
        players = new ArrayList<Player>();

        for (int i = 0; i < rules.minPlayers; i++)
        {
            players.add(new Player(defaultNames[i]));
        }

    }

    private void newGame()
    {
        //create new deck with 52 cards
        deck = new Deck(rules.smallestCardInDeck);     
        //reset players hands
        for (Player player : players)
        {
            player.resetHand();
        }
        //deal cards to players
        for (int i = 0; i < rules.handsize; i++)
        {
            for (Player player : players)
            {
                player.dealCard(deck.cards.pop());
            }
        }
        //print overview for player
        for (Player player : players) {
            System.out.println(player.toString());
        }
        //evaluate and print result
        evaluateWinner();

    }

    private void evaluateWinner()
    {
        int maxOfColor      = 0;
        int maxColorValue   = 0;
        String playerName   = "";

        for (Player player : players)
        {
            int[] playerScore = rules.score(player);
            if (playerScore[0] > maxOfColor)
            {
                maxOfColor = playerScore[0];
                maxColorValue = playerScore[1];
                playerName = player.name;
            }
            if (playerScore[0] == maxOfColor)
            {
                if (playerScore[1] > maxColorValue)
                {
                    maxColorValue = playerScore[1];
                    playerName = player.name;
                }
            }
        }

        System.out.println(playerName + " wins with " + maxOfColor + " of a color, kickervalue " + maxColorValue);
    }

    private static boolean askForNewGame(Scanner sc)
    {
        System.out.println("\nEnter 'Yes' to start. Anything else exits.");
        String userInput = sc.next();

        if (userInput.equals("Yes")) return true;
        else return false;
        
    }

    private static void welcomeScreen()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Welcome to the most exiting game in this universe.\n");
        sb.append("I am your assistant Bob and will autopilot you through the game.\n\n");
        sb.append("You and the computer will draw 5 cards, whoever has the most of one color wins.\n");
        sb.append("On a draw higher card value is the tiebreaker. Good Luck!");
        System.out.println(sb.toString());
    }

    private static void endScreen()
    {
        System.out.println("Thank you for playing the game I hope you enjoyed it!\n");
    }

    public static void main(String[] args) 
    {
        welcomeScreen();
        GameManager gm = new GameManager();
        Scanner scan = new Scanner(System.in);

        while (askForNewGame(scan))
        {
            gm.newGame();
        }

        endScreen();
        scan.close();
    }

}

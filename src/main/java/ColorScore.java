public class ColorScore extends Ruleset {

    ColorScore()
    {
        super(2, 5, 2, 10);
    }


    //implements the given ruleset and allocates a int[2] scores to each player representing the occurence of each color (score[0]) and the combined value of these cards (score[1])
    public int[] score(Player player)
    {
        int[] colorOccurences   = new int[4];
        int[] sumOfThisColor    = new int[4];

        for (Card card : player.hand)
        {
            colorOccurences[suitToPosition(card.suit)]++;
            sumOfThisColor[suitToPosition(card.suit)] += card.value;
        }
        int maxOcc = 0;
        int maxPos = -1;
        for (int i = 0; i < colorOccurences.length; i++)
        {
            //if bigger replace
            if (colorOccurences[i] > maxOcc)
            {
                maxOcc = colorOccurences[i];
                maxPos = i;
            }
            //if equal check for tiebreaker (card values), check against 0 to avoid sumOfThisColor[-1]
            if (colorOccurences[i] == maxOcc && colorOccurences[i] > 0)
            {
                if (sumOfThisColor[i] > sumOfThisColor[maxPos])
                {
                    maxOcc = colorOccurences[i];
                    maxPos = i;
                }
            }
        }
        int[] score = {maxOcc, sumOfThisColor[maxPos]};
        return score;

    }

    private int suitToPosition(char suit)
    {
        switch (suit)
            {
                case 'c': return 0;
                case 'd': return 1;
                case 'h': return 2;
                case 's': return 3;
            }
        return -1;
    }
}

public abstract class Ruleset {
    public final int smallestCardInDeck;
    public final int handsize;
    public final int minPlayers;
    public final int maxPlayers;

    protected Ruleset(int smallestCardInDeck, int handsize, int minPlayers, int maxPlayers)
    {
        this.smallestCardInDeck = smallestCardInDeck;
        this.handsize           = handsize;
        this.minPlayers         = minPlayers;
        this.maxPlayers         = maxPlayers;
    }

    public abstract int[] score(Player one);
}
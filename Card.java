public class Card implements Comparable<Card> {

    protected int suit;
    protected int rank;

    private static final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    private static final String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Jack", "Queen", "King" };

    /**
     * No-argument constructor.
     */
    public Card() {
        this(0, 0);
    }

    /**
     * Constructor with arguments.
     */
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Prints a card in human-readable form.
     */
    @Override
    public String toString() {
        return ranks[rank] + " of " + suits[suit];
    }

    /**
     * Return true if the cards are equivalent.
     */
    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if (obj instanceof Card) {
            Card that = (Card) obj;
            b = this.compareTo(that) == 0;
        }
        return b;
    }

    public static void printCard(Card card) {
        System.out.println(card);
    }

    /**
     * Compares two cards: returns 1 if the first card is greater
     * -1 if the seconds card is greater, and 0 if they are the equivalent.
     */
    public int compareTo(Card that) {
        // first compare the suits
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.suit < that.suit) {
            return -1;
        }

        // compare the ranks
        if (this.rank > that.rank) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        return 0;
    }

}
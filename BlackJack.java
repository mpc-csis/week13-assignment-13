/**
 * Write a description of class BlackJack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackJack {

    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7(); // Extra Credit
    }

    public static void problem1() {
        System.out.println("-- Problem 1 --------------------");

        //*======= Problem 1 Comparing Objects ============
        //a) Use the Card constructor that takes arguments to 
        //   Make a variable card1, of type Card, set to the Ace of Spades
        //   Make a variable card2, of type Card, set to the King of Spades
        //   Make a variable card3, of type Card, set to card1 (no new Card)
        //   Make a variable card4, of type Card, set to the Ace of Spades


        //b) Use the Card printCard method to print all your cards out 


        //c) Execute this statement to check for identity between card1 and card3
        //     System.out.println("Are card1 and card3 identical? " + (card1==card3));

        //   Now write a statement that checks for equivalence between card1 and card4

        //   Now write a statement that checks for identity between card1 and card4


        //d) Verify that this statement indicates that card1 comes before card2
        //     in the ordering for cards
        //     System.out.println("Comparing card1 and card2 gives: " + 
        //                          card1.compareTo(card2));

        //e)   Modify the compareTo method in the card class so that 
        //     Aces have a higher rank than Kings.  One way to do this is to 
        //     create two int variables rank1 and rank2 and copy the ranks of
        //     the two cards into them. Then, if rank1 is a 1, set it to 14.
        //     Do the same to rank2. Then run this program again and verify
        //     the output from d) now shows that the Ace comes after (has higher 
        //     rank) than the King.

        //------- End Problem 1 ------------------------------------*/
    }

    public static void problem2() {
        System.out.println("-- Problem 2 --------------------");

        /*======= Problem 2 Making a Deck of Cards ============
        //a) Find the "nested for loop" slide from lecture.
        //   Encapsulate the example code in a method below main so the
        //   following statement works properly. makeDeck should return the
        //   properly filled array of all Cards

        Card [] deck = makeDeck();

        //b) Find the "printDeck" slide from lecture. Copy that code
        //   below main, then call the method so you can see your deck.
        //   Debug any unexpected behavior




        //------- End Problem 2 ------------------------------------*/
    }

    public static void problem3() {
        System.out.println("-- Problem 3 --------------------");

        /*======= Problem 3 BlackJack Hand Score ============
        //a) In Blackjack the object of the game is to get a collection of cards
        //   with a score of 21. The score for a hand is the sum of scores for all
        //   cards. The score for an ace is 1, for all face cards is ten, and for
        //   all other cards the score is the same as the rank.
        //   Example: the hand (Ace, 10, Jack, 3) has a total score of
        //   1 + 10 + 10 + 3 = 24.

        //   Write a method called handScore below main that takes an array of cards as an
        //   argument and that returns the total score.


        //b) Demo your method by creating an array of cards such as the hand
        //   in the example, and verifying the proper calculation is made




        //------- End Problem 3 ------------------------------------*/
    }

    public static void problem4() {
        System.out.println("-- Problem 4 --------------------");

        /*======= Problem 4 Making a deal method ============
         //a) One way to deal a card is to select a card at random from the deck.
         //   This would mean creating a random integer from 0 to 51 and return
         //   the card at that location in the array. You can use the randomInt
         //   method from Assignment12 to generate this number. Or just multiply
         //   Math.random() times 52 and cast the result as an int.
         //
         //   Write a method called deal below main. This method should receive
         //   an array of cards as an argument and return a single card. Test
         //   your method by running this code:

         //   Card demoCard = deal(deck);
         //   System.out.print("I was dealt a ");
         //   Card.printCard(demoCard);


         //b) Write a for loop that repeats the above code 10 times. Make sure
         //   you are getting random cards


         //------- End Problem 4 ------------------------------------*/
    }

    public static void problem5() {
        System.out.println("-- Problem 5 --------------------");

        /*======= Problem 5 Playing one hand ============
         //a) Create a player's hand (an array of Cards called hand)
         //   Since we don't know how many cards we may want to receive,
         //   make the size of the array at least 10.
         //   Use a for loop to initialize all the cells of the array
         //   with a default Card object


         //b) Also declare an integer index and set it to 0. This will
         //   keep track of the index where the next card you receive
         //   will be stored in the array.

         //c) As an example of what we are doing, execute these statements
         //      hand[index] = deal(deck);
         //      index++;
         //      hand[index] = deal(deck);
         //      index++;
         //      printDeck(hand);
         //      System.out.println("The score of your hand is " + handScore(hand));

         //d) So that you don't have to view the default card values that
         //   aren't being used, copy the printDeck method and make a new
         //   version that receives the value of index as well. Then execute this:
         //     printDeck(hand,index);  // print cards in hand only up to index-1

         //e) If necessary, you could do the same for handScore, so that you
         //   don't count cards at index or higher.

         //------- End Problem 5 ------------------------------------*/
    }

    public static void problem6() {
        System.out.println("-- Problem 6 --------------------");

        /*=======  Problem 6 Deal until stay (Extra Credit 1 pt) ============
        //   We now want to simulate dealing a hand until we have to stop
        //   Do this with a while loop. The loop should keep running until
        //   our handScore is 17 or higher. Inside the loop, you should
        //   deal a card and store it in hand at index, add one to index
        //   Print out the value of each card as it is dealt, and the score
        //   When the loop finishes, determine weather the player got 21,
        //   went bust, or stayed at a value below 21.


        //------- End Problem 6 ------------------------------------*/
    }

    public static void problem7() {
        System.out.println("-- Problem 7 (Extra Credit) --------------------");

        /*======= Problem 7 Make a two player game (Extra Credit 1 pt) ============
        //   By now you have enough tools to make a game where a player
        //   can enter yes or no if they want to get another card.
        //   When the player stays or goes bust, you can run the loop
        //   in problem 6 for the computer's hand. Then determine who
        //   is the winner. Have fun!
        //------- End Problem 7 ------------------------------------*/
    }

    // Define method makeDeck here

    // Define method printDeck here

    // Define method handScore here

    // Define method deal here

}

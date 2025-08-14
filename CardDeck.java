import java.util.Scanner;
public class CardDeck {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
String[] deck = initializeDeck(suits, ranks);
deck = shuffleDeck(deck);
System.out.print("Enter number of cards to distribute per player: ");
int n = scanner.nextInt();
System.out.print("Enter number of players: ");
int x = scanner.nextInt();
String[][] players = distributeCards(deck, n, x);
printPlayers(players);
scanner.close();
}
public static String[] initializeDeck(String[] suits, String[] ranks) {
int numOfCards = suits.length * ranks.length;
String[] deck = new String[numOfCards];
int index = 0;
for (int i = 0; i < suits.length; i++) {
for (int j = 0; j < ranks.length; j++) {
deck[index] = ranks[j] + " of " + suits[i];
index++;
}
}
return deck;
}
public static String[] shuffleDeck(String[] deck) {
int n = deck.length;
for (int i = 0; i < n; i++) {
int randomCardNumber = i + (int) (Math.random() * (n - i));
String temp = deck[i];
deck[i] = deck[randomCardNumber];
deck[randomCardNumber] = temp;
}
return deck;
}
public static String[][] distributeCards(String[] deck, int cardsPerPlayer, int numOfPlayers) {
int totalCardsNeeded = cardsPerPlayer * numOfPlayers;
if (totalCardsNeeded > deck.length) {
System.out.println("Not enough cards in the deck to distribute!");
return null;
}
String[][] players = new String[numOfPlayers][cardsPerPlayer];
for (int i = 0; i < numOfPlayers; i++) {
for (int j = 0; j < cardsPerPlayer; j++) {
players[i][j] = deck[i * cardsPerPlayer + j];
}
}
return players;
}
public static void printPlayers(String[][] players) {
if (players == null) return;
for (int i = 0; i < players.length; i++) {
System.out.println("Player " + (i + 1) + ":");
for (int j = 0; j < players[i].length; j++) {
System.out.println(" " + players[i][j]);
}
System.out.println();
}
}
}
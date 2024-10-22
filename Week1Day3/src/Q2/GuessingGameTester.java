package Q2;

import java.util.Scanner;

public class GuessingGameTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GuessingGame game;
        boolean playAgain = true;

        while(playAgain) {
            System.out.println("Welcome to the Guessing Game\nEnter the maximum number");
            int max = in.nextInt();
            game = new GuessingGame(max);

            System.out.println("Enter number of guesses allowed");
            int maxGuessesAllowed = in.nextInt();
            game.newGame(maxGuessesAllowed);

            System.out.printf("answer is: %d(Included for testing only, should not be displayed in final program\n",
                    game.getAnswer());

            while(!game.isGameOver()) {
                System.out.printf("Enter your guess, remember it must be between 0 and %d\n", game.getMax());
                int guess = in.nextInt();
                String response = game.guess(guess);
                System.out.println(response);
            }

            System.out.println("Would you like to play again, enter Y for yes, N for no.");
            if(!in.next().equalsIgnoreCase("Y")) {
                playAgain = false;
            }
        }

        in.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int totalAttempts = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Guess the Number game!");

        while (true) {
            System.out.println("I have selected a number between 1 and 100. Can you guess it?");
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;

            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts!");
                    totalAttempts += attempts;
                    roundsWon++;
                    System.out.println("Score: Rounds Played: " + roundsWon + ", Total Attempts: " + totalAttempts);
                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.startsWith("y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        scanner.close();
    }
}


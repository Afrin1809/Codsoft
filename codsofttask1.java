package codsoft;
import java.util.Random;
import java.util.Scanner;
public class Codsofttask1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.print("Enter the number of rounds you want to play: ");
	        int rounds = scanner.nextInt();
	        int totalScore = 0;

	        for (int round = 1; round <= rounds; round++) {
	            System.out.println("\nRound " + round);
	            int secretNumber = random.nextInt(100) + 1;
	            int attemptsLeft = 10;

	            while (attemptsLeft > 0) {
	                System.out.print("Enter your guess (between 1 and 100): ");
	                int guess = scanner.nextInt();
	                attemptsLeft--;

	                if (guess == secretNumber) {
	                    System.out.println("Congratulations! You've guessed the correct number.");
	                    int score = 10 - attemptsLeft;
	                    totalScore += score;
	                    System.out.println("Score for this round: " + score);
	                    break;
	                } else if (guess < secretNumber) {
	                    System.out.println("Your guess is too low.");
	                } else {
	                    System.out.println("Your guess is too high.");
	                }

	                System.out.println("Attempts left: " + attemptsLeft);
	            }

	            if (attemptsLeft == 0) {
	                System.out.println("Out of attempts! The correct number was " + secretNumber + ".");
	            }
	        }

	        System.out.println("\nGame Over! Your total score: " + totalScore);

	        System.out.print("Do you want to play again? (yes/no): ");
	        String playAgain = scanner.next().toLowerCase();
	        if (playAgain.equals("yes")) {
	            main(args); // Restart the game
	        } else {
	            System.out.println("Thanks for playing! Goodbye.");
	        }

	        scanner.close();
	    }
	}
 
	
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int maxAttempts = 7;

        System.out.println("Guess the number between 1 and 100");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess > number) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too Low!");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Game Over! The number was " + number);
        }

        sc.close();
    }
}

  

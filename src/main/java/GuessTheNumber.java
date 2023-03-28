import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumber = 100;
        int numberOfAttempts = 5;
        int randomNumber = random.nextInt(maxNumber) + 1;

        System.out.println("I'm thinking of a number between 1 and " + maxNumber + ".");
        System.out.println("You have " + numberOfAttempts + " attempts to guess it.");

        for (int i = 1; i <= numberOfAttempts; i++) {
            System.out.print("Guess #" + i + ": ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + i + " attempts.");
                return;
            }
        }

        System.out.println("Sorry, you didn't guess the number. It was " + randomNumber + ".");
    }

}


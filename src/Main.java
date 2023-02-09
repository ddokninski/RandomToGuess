import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randNumberToGuess = random.nextInt(100);
        int guessTryCounter = 5;

        System.out.print("Enter an integer between 0 and 99: ");
        Scanner scan = new Scanner(System.in);
        int numberFromUser = scan.nextInt();

        while (guessTryCounter > 1) {
            if (numberFromUser > randNumberToGuess) {
                guessTryCounter--;
                System.out.println("Your number is GREATER than the one you are trying to guess");
                System.out.println("You have " + guessTryCounter + " chance to guess.");
                System.out.print("Please try again: ");
            } else if (numberFromUser < randNumberToGuess) {
                guessTryCounter--;
                System.out.println("Your number is LOWER than the one you are trying to guess");
                System.out.println("You have " + guessTryCounter + " chance to guess.");
                System.out.print("Please try again: ");
            } else {
                System.out.println("You guessed it!");
                break;
            }
            numberFromUser = scan.nextInt();
        }

        if (guessTryCounter == 1) {
            System.out.println("Sorry you didn't guess the number, the answer was: " + randNumberToGuess);
        }
    }
}
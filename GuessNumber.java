import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        System.out.println("The computer will try and guess your number between 1 to 10");
        Scanner scan = new Scanner(System.in);
        Boolean trueorFalse = false;
        Random rand = new Random();
        int correctGuess = 0;

        int count = 0;

        while (!trueorFalse) {
            correctGuess = rand.nextInt(11);
            System.out.print("Is it "+ correctGuess +"?" + " (y/n): ");

            if (scan.next().toLowerCase().charAt(0) == 'y') {

                trueorFalse = true;

            }
            count++;
        }

        System.out.print( "I found your number of "+ correctGuess+ " correct  in " + count + " guesses");
    }}


import java.util.Locale;
import java.util.Scanner;

public class difference{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in); //Allows the computer to detect if the user has entered anything
        String userString = inputChecker(scan, 2 );
        // Sends the user String input into the method difference where the string will be compared to itself
        int valueOfString = difference(userString);

        // once the value of String value is found use a if/else statement to separate the code
        if (valueOfString == 0 ) {
            System.out.println("Both your letters are the same ");
        } else {
            System.out.println("Your two letters are different by " + valueOfString + " positions");
        }

    }

    public static String inputChecker(Scanner scan, int goal) {
        int brakeCheck = 0;
        //This is used for the checking if the length of the string is equal to the want that we want if not run while loop again
        String returnInput = "";
        //intializing the input cheker
        while (brakeCheck == 0) {
            System.out.print("Enter a String with any two letters between A and Z: ");
            //asks the user Enter a string
            while(scan.hasNextInt() || scan.hasNextDouble() ) {
                // this while loop checks if the input is a String
                scan.next();
                System.out.print("That is not a proper input, Enter a String with any two letters between A and Z: ");
            }
            returnInput = scan.nextLine();
            if (returnInput.length() == goal) {
                //if loop checks for the reaaching of the goal value
                brakeCheck = 1;
            }
        }
        return returnInput;
    }
    public static int difference(String userInput) {
        int value = 0;
        userInput = userInput.toUpperCase();
        // unifies all values to equal only uppercase values
        if (userInput.charAt(0) == userInput.charAt(1)) {
            // if the char equals each other than they should return a 0
            return value;
        } else {
            int digitOne = userInput.charAt(0);
            // to make life easier I assigned the char of each value in the String to a separate number at which I can compare
            int digitTwo = userInput.charAt(1);
            //I must subtract digitOne and digitTwo and that will give me the number of positions they are separated by
            if (digitOne > digitTwo ) {
                value = digitOne -digitTwo;
            } else {
                value = digitTwo -digitOne;
            }
            // this gives me the difference 0f the positions, how far the letters are apart
            return value;
        }

    }
}
import java.util.Scanner;

public class ksuga_program1 {
    public static void main(String[] args) {
        smallestTwo();
    }
    public static  int typeANumber(Scanner scanner) {
        System.out.printf("Please enter any non-negative integer (or negative number to quit): ");
        return scanner.nextInt();
        /* This allows the user to input values into the console at which this method
        * transforms that data into another method from where it was called from*/

    }
    public static void smallestTwo () {
        Scanner scan = new Scanner(System.in);
        int smallest, nextSmallest, current; /*The problem needed a total of 3 variables 2 for holding the smallest a
                                                Next smallest to hold values and current value to hold the new value*/
        smallest = typeANumber(scan); //first input is this value
        nextSmallest = typeANumber(scan); // second input is this value
        current = typeANumber(scan); // third input

        while (current >= 0 ){
            if (nextSmallest < smallest) { //compares the next smallest and smallest value and switches places
                int temporary = smallest;
                smallest = nextSmallest;
                nextSmallest = temporary;
            }
            if(current < nextSmallest) { //compares the next smallest and current value and switches if necessary
                nextSmallest = current;
            }
            current= typeANumber(scan); // moves the current value to the next value
        }

        System.out.printf("The smallest number %s and the next smallest is %s", smallest , nextSmallest);
        /* Prints the output of small and next smallest values to the console*/
    }

}
import java.util.Random;

public class ExamTHREEErrorsFixedSp22
{
    /*
    This .java file contains both compile time and run time errors. Fix them so the code compiles and runs.
    File contains at least 5 errors
    Make your corrections match the original intent of the code (What the programmer intended)
     */
    public static void main(String[] args){
        Random rand = new Random();
        int aNumber;
        boolean isHot;
        String[] myFriends = {"John","Jane", "Jake", "Janice"};
        aNumber = 42;

        //Welcome
        System.out.println("Here's some programming I learned in COMP 170");
        //Give a random value to a boolean variable
        isHot = rand.nextBoolean();
        //Let's call a method that returns a value and print out the results
        calculateNewNumber( isHot, aNumber );
        //Print out all my friends
        for (int i = 0; i < 4; i++) {
            String name = myFriends[i];
            System.out.println(name);
        }
    }

    public static double calculateNewNumber( boolean b, double d) {
        if (b) {
            return d*2;
        }
        else {
            return -d;
        }
    }
}
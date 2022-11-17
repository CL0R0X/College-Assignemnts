

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MyProgram {


        public static void main(String[] args) throws FileNotFoundException {
            Scanner input = new Scanner(new File("inputNumbers.txt"));
            int count = 0;
            int smallest = 0;
            int largest = 0;

            while (input.hasNextInt()){
                int number = input.nextInt(); //selects next number in text
                if (number%2 == 1 || number%2 == -1) { //collects negative and positive odd num
                    count++;

                    if( smallest>largest){ //compares the largest and smallest value and switches places
                    int temporary = smallest;
                    smallest = largest;
                    largest = temporary;
                    }

                    if(number < smallest) {//compares the smallest and current value and switches if necessary
                        smallest =number;
                    }
                    if (number >largest){//compares the largest and current value and switches if necessary
                        largest =number;
                    }

                    }
                }
            System.out.printf("The count of odd numbers in the file is %s \n" +
                    "The smallest odd number in the file %s \n" +
                    "The largest odd number in the file %s ", count, smallest, largest);
            } // prints out text
        }


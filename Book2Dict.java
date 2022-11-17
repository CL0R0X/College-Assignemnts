import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Book2Dict {
    //The url for the book
    static final String BookURL = "https://www.gutenberg.org/files/98/98-0.txt";

    //The number the dictionary can hold
    static int CAPACITY = 3;

    //The count of occupied positions in the array
    static int COUNT = 1;

    static String dictionary[] = new String[CAPACITY];

    /**

     @param (Checker) a boolean public boolean void where it checks the array that is generated for any repeats
     when a new word needs to be added to the array; this method will be a while looop that
     @return a true or false value when there is a presense of the same word or not

     I must make the method browsTextfile call the checker method every time there is a word that is scanned from the
     textfile once there is a value of true or false. Send that value to another method which holds all of the
     words in a array
     */

    /** Use main() to call other methods; don't put all your code in main. */



    public final static Scanner browseTextFile(final String link) {
        // Declare the return variable
        Scanner fileOnline;
        // Use try/catch to prevent the program from crashing.
        try {
            // Create a URL object from the link provided
            URL url = new URL(link);
            // Turn the URL into a Scanner
            fileOnline = new Scanner(url.openStream());

        } catch (IOException e) {
            // If something goes wrong, prepare to return null Scanner.
            fileOnline = null;
        }
        return fileOnline;
    }  // method browseTextFile

    //The first method adds to the array
    /*
    Process for adding a String from the array:
    if count  < capacity:
        add the word
        count++
        capacity ++
     */
    public static void add2Dictionary (String word) {

        if(COUNT < CAPACITY) {

            //System.out.println("added " + word + "\n");
            dictionary = increaseArraySize(dictionary);
            dictionary[COUNT+1] = word;
            COUNT++;

        }
        }

    //We transfer the old array into a new array and then replace the old array into a new array

    public static String[] increaseArraySize(String[] oldDictionary){
        String[] newDictionary = new String[CAPACITY + 1];
        for (int i = 0; i < oldDictionary.length; i++) {
            newDictionary[i] = oldDictionary[i];
        }
        return newDictionary;
    }

    //The second method for checking if the dictionary has any repeats
    /*
    boolean match = true
    for (i =0; i< dictionary.length(); i__ ):
        if dictionary[i] != word
            match = true

         else:
            match = false
     return match
     */

    public static boolean checker(String word) {
        boolean match = false;
        for (int i = 0; i < CAPACITY; i++) {
            if (dictionary[i] == word) {
                match = false;
                //continue;
            } else {
                match = true;
                continue;
            }
        }
        return match;
    }
    /*
   Letters only method
   because this program is case sensitive I must only have 1 word that only contains letters that are lower case
   */
    public static String lettersOnly (String  text){
        String lowercase = "";
        //changes
        String tLowerCase = text.toLowerCase();
        //loop to remove letters
        for (int i = 0; i < tLowerCase.length(); i++) {
            if ((int) tLowerCase.charAt(i) > 96 || tLowerCase.charAt(i) < 123) {
                lowercase = lowercase + tLowerCase.charAt(i);
            }
        }
        return lowercase;
    }


    public static void main(String[] args) {
        // Link to A Tale of Two Cities
        Scanner txtFile = browseTextFile(BookURL);
        //Gets the next word in the text file
        dictionary[0] = txtFile.next();
        while(txtFile.hasNext()) {
            String text = txtFile.next();
            System.out.println("word " + text);
            String textLower = lettersOnly(text);
            System.out.println(textLower);
            //Checks if there is a repeat in the array
            boolean canAdd = checker(textLower);

            if (canAdd == true) {
                add2Dictionary(text);
            } else {
                continue;
            }
        }

    }  // method main

}  // class BookToDictionary
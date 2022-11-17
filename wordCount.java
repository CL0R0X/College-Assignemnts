import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class wordCount {
     public static void main(String[] args) throws FileNotFoundException {
         Scanner input = new Scanner(new File("hamlet.txt"));
         int count = 0;
         int charCount = 0;
         int lineCount = 0;
         while(input.hasNextLine()){
             String words = input.nextLine();
             for( int  i = 0; i < words.length(); i++) {
                 char lines = words.charAt(i);
                 charCount++;
                 if(lines == ' ' ){
                     count++;
                 }
             }
             lineCount++;
         }
         System.out.println("The total amount of words in the text Hamlet.txt: "+ count);
         System.out.println("The total amount of Characters in the text Hamlet.txt: "+ charCount);
         System.out.println("The total amount of lines in the text Hamlet.txt: "+ lineCount);
     }
}
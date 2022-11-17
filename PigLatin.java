import java.util.Scanner;

public class PigLatin {
    /*
    The first main statement will ask the user for a statement to be translated to pig latin
    then it would be sent to another class in which would change the statement
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a statement in english to be translated in Pig Latin:");
        String englishStatement = scan.nextLine();
    sentence(englishStatement);
    }
    /*
    I will change the multi worded statement to a array and individually send it to the pigLatinTranslate class
    then print the response immediately
     */
    public static void sentence(String statement) {
        String[] statementArr = statement.split(" ");

        for (int i = 0; i < statementArr.length; i++) {
            System.out.print(pigLatinTranslate(statementArr[i]) +" ");
        }

    }
    /*
    I will splice the word if it has any vowels in the English word and add -ay
    to the end and remove the first letter of the word and add to the end to get the pig latin translation
     */
    public static String pigLatinTranslate(String statement) {
        //translates for one word
        int statementLength = statement.length();
        int index = -1;

        for (int i = 0; i < statementLength; i++){
            if(vowel(statement.charAt(i))){
                //Checks if there is a vowel in the given word by going through all the letters in the word
                index = i;
                break;
            }
        }

        if (index == -1) {
            return statement;
        }

        return statement.substring(index) + "-"+statement.substring(0,index) + "ay";
    }

    /*
    The vowel class allows there to be a template in which the letters would be checked if they have a vowel or not
     */
    public static boolean vowel(char ch) {
        return(ch == 'A' || ch == 'a' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u' || ch == 'E' || ch == 'e');
    }


}

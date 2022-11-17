import java.util.Scanner;

public class ceaaserCipher {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scan.nextLine();
        System.out.print("Encoding key: ");
        int key = scan.nextInt();

        storage(message, key);
    }

    public static void storage(String message, int key) {
        int messageLength = message.length();
        char[] letterList = new char[messageLength];
        for (int i = 0; i < messageLength; i++) {
            char oneMessage = message.charAt(i);
            char newMessage = Character.toLowerCase(oneMessage);
            letterList[i] = newMessage;

        }
        cipher(letterList, key);


    }

    public static void cipher(char[] message, int key) {
        int messageLength = message.length;
        String coded = "";
        for (int i = 0; i < messageLength; i++) {
            int hold = message[i] + key;
            if (hold == 32 + key) {
                hold = 32;
            } else if (hold > 122 + key) {
                int newNumber = (hold - 122) + 97;
                hold = newNumber + key;
            }

            char inverted = (char) hold;

            inverted = Character.toUpperCase(inverted);
            coded = coded + inverted;

        }
        System.out.print("Your message is: " + coded);

    }
}
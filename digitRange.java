import java.util.Scanner;

public class digitRange {

    public static void scan4Num() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int newNum = digit(num);
        System.out.println("Digit range: " + newNum);

    }

    public static int digit(int num) {
        num = Math.abs(num);
        int max = num % 10;
        int min = num % 10;
        num /= 10;

        while (num > 0) {
            int number = num % 10;
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            num /= 10;
        }
        return max - min + 1;

    }


}
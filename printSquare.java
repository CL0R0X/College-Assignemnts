import java.util.Scanner;

public class printSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a minimum number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a maximum number: ");
        int num2 = scan.nextInt();
        printSquares(num1, num2);
    }

    public static void printSquares(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            for (int j = i; j <= num2; j++) {
                System.out.print(j);
            }
            for (int j = num1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
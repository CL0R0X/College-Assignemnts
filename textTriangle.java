import java.util.Arrays;
import java.util.Scanner;

public class textTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] triangleLength = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Print sidelength of a triangle: ");
            int num = scan.nextInt();
            triangleLength[i] = num;

        }
        for (int i = 0; i <= 0; i++) {
            if (triangleLength[i] + triangleLength[i + 1] < triangleLength[i + 2] || triangleLength[i + 2] + triangleLength[1 + i] < triangleLength[i] || triangleLength[i + 2] + triangleLength[i] < triangleLength[i + 1]) {
                throw new IllegalArgumentException();
            }

        }
        printTriangleType(triangleLength[0], triangleLength[1], triangleLength[2]);

    }

    public static void printTriangleType(int num1, int num2, int num3) {

        if (num1 == num3 && num1 == num2) {
            System.out.print("equilateral");
        } else if (num1 == num3 || num1 == num2 || num2 == num3) {
            System.out.print("isosceles");
        } else {
            System.out.print("scalene");
        }
    }


}
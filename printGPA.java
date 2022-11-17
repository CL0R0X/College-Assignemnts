import java.util.Scanner;

public class printGPA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a student record: ");
        System.out.print("Enter a student name: ");
        String student = scan.next();
        System.out.print("Enter number of classes: ");
        int numberOfClass = scan.nextInt();
        int grade = 0;
        for (int i = 0; i < numberOfClass; i++) {
            System.out.print("Enter grade: ");
            int grades = scan.nextInt();
            grade = grade + grades;


        }
        int newGrade = grade / numberOfClass;
        System.out.println(student + "'s grade is " + newGrade);

    }


}
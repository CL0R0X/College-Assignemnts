import java.util.Scanner;

public class fiftydigit {
    /*
    In order to store these large numbers we must store them in a String then translate it back to integer
    to do the arithmetic
     */
    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers which have to more than 50 digits: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Number 1: ");
        String num1 = scan.nextLine();
        System.out.print("Number 2: ");
        String num2 = scan.nextLine();

        //transforms string into integer
        int[] numArr1 = string2Int(num1);
        int[] numArr2 = string2Int(num2);

        //begin addition of the array
        int[] result = new int[51]; //final result array
        int remaining = 0;

        //add every single digit and add the remaining
        for(int i = 0; i <50; i++) {
            int sum = numArr1[i] + numArr2[i] + remaining;
            if (sum > 9) {
                result[i] = sum % 10;
                remaining =1;
            } else {
             result[i] = sum;
             remaining = 0;
            }
        }

        System.out.print("Result: " + result);

    }
//creates a array in characters then individually puts in a integer array

    public static int[] string2Int(String num) {
        char[] charArr = num.toCharArray();
        int[] numArr = new int[50];

        int index = 0;
        for (int i = (charArr.length-1); i >= 0; i--){
            numArr[index] = Integer.parseInt("" + charArr[i]);
            index++;
        }

        return numArr;
    }

}
public class ksuga_program2 {
    public static void main(String[] args) {
        Scanner170 scan = new Scanner170(System.in); //First we must gain data from user on double number

        System.out.print("Enter a double number 0-10.0: ");
        double numberSum = scan.nextDouble();

        while(numberSum > 10.0 || numberSum<= 0 ) { //I try to limit the amount the series of numbers between  10 and 0

            if(!scan.hasNextDouble()) { //limits the type of numbers to double only

                System.out.printf("Enter a double number 0-10.0: "); // makes the user input another value
                numberSum = scan.nextDouble();

            }

        }

        // accepts the double integer that will be used for creating the max value of adding fractions
        fractionSum(numberSum);//sends it to another function
    }
    public static void fractionSum(double sum) {
        double fractionSums = 1.0;
        double i = 1.0; //i must be double because double /double = double number
        double sumFraction = 0;
        System.out.print(sumFraction);
        while (sum >= sumFraction) { //sets the min and max number for the code to reach in order to stop
            sumFraction += fractionSums/i; //adds the previous term to the next term
            System.out.print(" + " +sumFraction); // prints the term to the console

           i++; // adds 1 to the i variable
        }
        System.out.print(" = " +sumFraction); //prints the sum
    }


}
import java.io.InputStream;
import java.time.Year;
import java.util.Scanner;

public class Calandardate {
    /*
    This is a example of Sakomoto algorithm in code form:

    This main code would request user info to follow towards the code and verify whether the information
    is in appropriate form of information
     */
       public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Please Enter a month in numbers: ");
            int month = scan.nextInt();
            System.out.print("Please enter a day: ");
            int day = scan.nextInt();
            System.out.print("Please enter a year: ");
            int year = scan.nextInt();

            /*
            while (month != "January" || month != "February" || month != "March" || month != "April" || month != "May" || month != "June" || month != "July" || month != "August" || month != "September"|| month != "October" || month != "November" || month != "December") {
                System.out.println("Please enter a month that are January, February, March, April, May, June, July, August, September, November, December: ");
                month = scan.nextLine();
            }

             */
           while (month >12 || month< 0) {
               System.out.println("Please enter a number of month between 1 and 12 (January, February, March, April, May, June, July, August, September, November, December:");
               month = scan.nextInt();
           }
            while (day <1 || day > 31 ) {
                System.out.print("Please enter a number of a day that is between 1 and 31: ");
                day = scan.nextInt();
            }
            while (year  / 1000 < 1 || year / 10000 >= 1) {
                System.out.print("Please enter a four digit year: ");
                year = scan.nextInt();
            }
          //int monthNum = string2Num(month);
          formula4Date(month, day, year);

       }
       /*
       public static int string2Num(String month) {
           int monthNum = 0;

           if(month == "January") {
               monthNum =1;
           }  else if (month == "February") {
               monthNum = 2;
           }  else if (month == "March") {
               monthNum = 3;
           } else if (month == "April") {
               monthNum = 4;
           } else if  (month == "May") {
               monthNum = 5;
           } else  if(month == "June") {
                monthNum =6;
           } else if (month == "July") {
                monthNum =7;
           } else if (month == "August") {
                monthNum =8;
           } else if (month == "September") {
                monthNum =9;
           }else if (month == "October") {
                monthNum =10;
           }  else if (month == "November") {
                monthNum =11;
           } else if (month == "December") {
                monthNum =12;
           }
           return monthNum;
       }

        */
    /*
    in this class it calculates the date needed for calculating the date of the year
    it is made by adding the last 2 digit of the year and the year code and the and the month code and the
    date code and the century code and subtract leap code then %7 and % 7 again

    in order to find the month code and the century code I sent the information to another class
     */

       public static void formula4Date(int month, int date, int year) {
           int last2Digit = year % 100;

           int yearCode = ((last2Digit / 4) + last2Digit ) % 7;

           int monthCode = monthForm(month);

           int centuryCode = centuryCodeForm(year);

           int dateCode = date;

           int leapCode;
           if (year % 4 == 0 && date == 29 && month == 2) {
               leapCode = 1;
           } else {
               leapCode = 0;
           }

           int formula = ((yearCode +monthCode +dateCode + centuryCode - leapCode) % 7)%7 ;

           dayFormula(formula);
       }

       /*
       to find the month code each month value is equal to a certain number so you would rassign the
       month number to another number according to the information the user has given
        */
       public static int monthForm(int month) {
           int num = 0;
           if (month == 1){
               num = 0;
           } else if( month == 2) {
               num = 3;
           } else if (month == 3) {
               num = 3;
           } else if  (month == 4) {
               num =  6;
           } else if (month == 5) {
               num = 1;
           } else if (month == 6) {
               num = 4;
           } else if ( month == 7) {
               num = 6;
           } else if  (month == 8) {
               num = 2;
           } else if (month == 9) {
               num = 5;
           } else if (month == 10) {
               num = 0;
           } else if (month == 11) {
               num = 3;
           } else if (month == 12 ) {
               num = 5;
           }
           return num;

       }
       /*
       the century code is found by dividing year by 100 and then %4 that previous value
       and if the value is equal to 0,1,2,3,4 it gets assigned a certain code which is called to the main formula
        */
       public static int centuryCodeForm(int year) {
           int century = year/ 100;
           int centuryDate = century % 4;
           int centuryCode = 0;
           if (centuryDate == 0) {
               centuryCode= 6;
           } else if (centuryDate == 1) {
               centuryCode= 4;
           } else if (centuryDate == 2) {
               centuryCode = 2;
           } else if (centuryDate == 3) {
               centuryCode = 0;
           }
           return centuryCode;
       }

       /*
       according to the final number that is found in the class formula2date there is a day of the week assigned
       to the number
        */
       public static void dayFormula(int code) {
           if (code == 0 ) {
               System.out.println("The day of the week is Sunday");
           } else if ( code == 6  ) {
               System.out.println("The day of the week is Saturday ");
           } else if (code == 1) {
               System.out.println("The day of the week is Monday");
           } else if( code == 2) {
               System.out.println("The day of the week is Tuesday");
           } else if (code == 3) {
               System.out.println("The day of the week is Wednesday");
           } else if (code == 4 ) {
               System.out.println("The day of the week is Thursday");
           } else if( code == 5) {
               System.out.println( "The day of the week is Friday");
           }


       }

}
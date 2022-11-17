import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args)
    {
		/* Two parallel arrays to hold phone numbers and names
			ith name matches ith phone number; 0 indicates number unknown
			the L tag at the end of the numbers makes them a java long primitive type
			(necessary to fit 10 digits)
			You may extend these arrays but DO NOT modify the types
		 */
        long[] numbers = {9876543210L, 0, 3129152000L, 9094567890L, 3034061234L, 0, 0, 8133774578L};
        String[] names = {"Adam Smith", "George Washington", "Alexander Hamilton", "Thomas Payne",
                "Betsy Ross", "Martha Washington", "Deborah Sampson", "Patience Wright"};

        //TODO: call the methods to test them. You can call them multiple times. Do some phone changes
        updateNumbers(numbers, names);
        showPhoneNumbers(numbers, names);
    }

    /**
     * Ask the user to update zero or more phone numbers using a Scanner170 object. User enters name
     * of person, if that person found in people parameter, then allow update of corresponding phone number
     * in phoneNumbers parameter.
     *
     * Loop asking for names for which to update the phone number until user enters *Done*
     *
     * @param phoneNumbers - array of phone numbers in order matching names (0 indicates number unknown)
     * @param people - array of people names in same order as phone numbers
     * @return boolean true if any numbers were changed; false if no numbers changed successfully (for
     * 			example if user never enters a name found in people
     *
     * 	TODO: Enter the rest of your pseudo code here (give details on how you will process user requests,
     * 	search and make changes.
     * The person is what the console is asking for and the number is what is given
     * There is a scannner object that searches through the list of people and then that would return a number
     * but first I must acknowledge how there is a numbers are associated with a person and finish that mechanism
     * update numbers would basically hold all the info about the
     *  phone matching with people and returning that value
     *
     *
     *
     */
    public static boolean updateNumbers(long[] phoneNumbers, String[] people) {
        //TODO:  write your code here
        Boolean result = false;
        Scanner scan = new Scanner(System.in   );
        System.out.print("Enter a Name or *Done* to end: "); // the user enters data
        String userInput = scan.next();
        while(!userInput.equals("*Done*")) { // this loop allows for the user to repeat the scan for till there is *Done*
            int positionInArray = -1;
            int index = 0;

            while(positionInArray ==-1 && index < people.length){
                if(people[index].indexOf(userInput) >= 0){ // This part marks the index at which should operate it
                    positionInArray = index;
                }
                index++;

            }
            if (positionInArray >-1) {
                result = true;
                System.out.print("Enter a new phone number: ");
                long newPhone = scan.nextLong(); // replaces the old phone number with the new number
                phoneNumbers[positionInArray] = newPhone;


            }
            System.out.print("Enter a Name or *Done* to end: ");
            userInput = scan.next();
        }
        return result;  // temporary so stub compiles.  Replace with your full code for method
    }

    /**
     * Show the full set of names and phone numbers in the format indicated in the assignment
     * (Display them to the console)
     *
     * @param phoneNumbers- array of phone numbers in order matching names (0 indicates number unknown)
     * @param people- array of people names in same order as phone numbers
     *
     * TODO:  Enter full pseudo code here (give details about how you will process the input parameters
     *              and how you will create the correct format.  If helpful, mention key variables to use
     *
     *  this is where the phone numbers is returned after the
     *
     *
     */
    public static void showPhoneNumbers(long[] phoneNumbers, String[] people) {
        //TODO:  write your code here
        for(int i = 0; i < people.length; i++) {
           String phoneString = "";
            if (phoneNumbers[i] == 0l) //Changes the 0 to *Unknown*
                phoneString = "*Unknown*";
             else
                phoneString = String.format("%d", phoneNumbers[i]);

            System.out.printf("\n| %20s | %11s |" , people[i], phoneString);
        }
    }
}
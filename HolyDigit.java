import java.util.Random;

public class HolyDigit {
public static void main(String[] args) {
    Random rand = new Random();
    int digitThousand;
    int digitHundred;
    int digitTens = rand.nextInt(10);
    int digitOnes;
    while (!(digitTens == 1)) {
        digitTens = rand.nextInt(10);
    }
    digitThousand = digitTens * 5;
    int partOne = digitTens + digitThousand;
    partOne = 23 - partOne;
    digitOnes = partOne/2;
    digitHundred = digitOnes + partOne%2;

    System.out.print("Riddler plans to strike on: " + digitThousand +digitHundred +digitTens +digitOnes + " street");

}

}
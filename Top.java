public class Top {

    public static final int SIZE = 4;

    /**
     * Prints a single line with the basic axle pattern, i.e.,
     * a number of preceding spaces following by the two
     * vertical bars. The number of preceding spaces is SIZE-1
     */
    public static void axleBasis() {
        for (int i = 1; i < SIZE; i++) {
            System.out.print(" ");
        }
        System.out.print("||");
        System.out.println();
    } // method axleBasis


    /**
     * Calls the axleBasis method a number of times, determined
     * by variable SIZE, to form the long structure of the spintop
     */
    public static void axle() {
        for (int i = 0; i < SIZE; i++) {
            axleBasis();
        }
    }

    public static void axle2() {
        for (int i = 0; i < SIZE - 3; i++) {
            axleBasis();
        }
    }
    // method axle

    /**
     * Method to print the top part of the spin's round component
     */
    public static void topRound() {
        for (int i = 1; i <= SIZE - 1; i++) {
            for (int j = 1; j <= SIZE - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("||");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } // method topRound


    /**
     * Method to print the widest part of the spin
     */
    public static void widePart() {
        for (int i = 1; i <= 2 * SIZE; i++) {
            System.out.print("=");
        }
        System.out.println();
    } // method widePart

    public static void bottomPart() {
        for (int i = 1; i <= SIZE - 1; i++) {
            for (int k = 1; k <= (i + SIZE - 1) - SIZE; k++) {
                System.out.print(" ");
            }

            for (int l = SIZE - 2; l >= i - 1; l--) {
                System.out.print("*");
            }

            System.out.print("||");
            for (int l = SIZE - 2; l >= i - 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void box() {
        for (int i = 1; i <= SIZE; i++) {
            for (int k = 1; k <= 2 * SIZE; k++) {
                System.out.print("=");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        axle();
        topRound();
        widePart();
        bottomPart();
        axle();
        axle();
        axle2();
        box();

    }
}


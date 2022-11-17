public class Triangle {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        triangle();
    }


    public static void triangle() {

        for (int i = 1; i <= SIZE - 1; i++) {
            for (int j = 1; j <= SIZE - 1 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}



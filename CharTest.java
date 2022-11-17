public class CharTest {
    public static void main(String[] args) { // comment
        System.out.print("enter 5 characters for me to print: ");
        Scanner170 in = new Scanner170();
        for (int i = 0; i < 5; i++) {
            char c = in.nextChar();
            if (c == '\n') {
                System.out.println("\\n");
            } else if (c == '\t') {
                System.out.println("\\t");
            } else {
                System.out.println(c);
            }
        }
    }
}

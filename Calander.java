public class Calander {
    public static final int SIZE = 6;
    public static final String design = "-";
    public static final int base = 1;
    public static final int width = 3;


    public static void main(String[] args) {
        printCalender(1, 30);
    }

    public static void printCalender(int firstSunday, int dayCount) {
        daysOWeek();
        calFrame();
        week1(firstSunday);
        week2(firstSunday);
        week3(firstSunday);
        week4(firstSunday);
        week5(firstSunday, dayCount);
        emptyBoxs();
        calFrame();

    }

    public static void calFrame() {
        for (int s = 1; s <= 7; s++) {
            System.out.print("+");
            for (int i = 1; i <= SIZE; i++) {
                System.out.print(design);
            }
        }
        System.out.println("+");
    }

    public static void daysOWeek() {
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat  ");
    }

    public static String padding(int n, int width) {
        String s = "" + n + "";
        for (int i = s.length(); i < width; i++) {
            s = " " + s + " ";
        }
        return s;
    }

    public static String printNum(int n, int width) {
        String line = "|";
        String square = line + " " + padding(n, width);
        return square;
    }

    public static String printNum2(int n, int width) {
        String line = "|";
        String square = line + padding(n, width);
        return square;
    }

    public static String printNum3(int n, int width) {
        String line = "|";
        String square = " " + padding(n, width) + line;
        return square;
    }

    public static String printBlank(int width) {
        String s = "" + "|";
        for (int i = s.length(); i < width; i++) {
            s = " " + s;
        }
        return s;
    }

    public static void week1(int firstSunday) {
        System.out.print("|");
        for (int r = 1; r <= (8 - firstSunday) % 7; r += 8) {
            System.out.print(printBlank(width + 4));
        }
        for (int m = 1; m <= 7; m++) {
            String week = printNum3(m, width);
            System.out.print(week);
        }
        System.out.println();
    }

    public static void week2(int firstSunday) {
        for (int m = 8; m <= 9; m++) {
            String week = printNum(m, width);
            System.out.print(week);
        }
        for (int p = base + 9; p <= 14; p++) {
            String week2 = printNum2(p, width + 1);
            System.out.print(week2);
        }
        System.out.println("|");
    }

    public static void week3(int firstSunday) {
        for (int m = base + 14; m <= 21; m++) {
            String week2 = printNum2(m, width + 1);
            System.out.print(week2);
        }
        System.out.println("|");
    }

    public static void week4(int firstSunday) {
        for (int m = base + 21; m <= 28; m++) {
            String week2 = printNum2(m, width + 1);
            System.out.print(week2);
        }
        System.out.println("|");
    }

    public static void week5(int firstSunday, int dayCount) {
        for (int m = base + 28; m <= dayCount; m++) {
            String week2 = printNum2(m, width + 1);
            System.out.print(week2);
        }
        System.out.print("|");
        for (int k = 1; k <= 35 - dayCount; k++) {
            System.out.print(printBlank(width + 4));
        }
        System.out.println();
    }

    public static void emptyBoxs() {
        System.out.print("|");
        for (int k = 1; k <= base * 7; k++) {
            System.out.print(printBlank(width + 4));
        }
        System.out.println();
    }
}

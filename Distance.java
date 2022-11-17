public class Distance {
    public static void main(String[] args) {
        System.out.println(distForm(10, 2, 3, 15));

    }

    public static double distForm(int x1, int x2, int y1, int y2) {
        double xminusx = Math.pow((x2 - x1), 2);
        System.out.println(xminusx);
        double yminusy = Math.pow((y2 - y1), 2);
        System.out.println(yminusy);
        double distFormula = Math.sqrt(xminusx + yminusy);
        return distFormula;

    }

}
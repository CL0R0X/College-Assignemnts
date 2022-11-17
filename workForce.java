public class workForce {
    public static void main(String[] args) {
        workRecord wA = new workRecord("John");
        workRecord wG = new workRecord("Bob");

        System.out.println(wG.getHours());
        wG.addHours(8);
        System.out.println(wG.getHours());
        wG.addHours(8);
        System.out.println(wG.getHours());
        wG.addHours(8);
        System.out.println(wG.getHours());
    }
}

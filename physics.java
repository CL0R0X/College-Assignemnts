public class physics {
    public static void main(String[] args) {
        repeatPhysicseqn();
        repeatPhysicseqn();
        repeatPhysicseqn();
        repeatPhysicseqn();
        repeatPhysicseqn();
        repeatPhysicseqn();
        repeatPhysicseqn();

    }

    public static void value1OfPhyiscs() {
        double s;
        double t = 1.5;
        double s0 = 2;
        double v0 = 4;
        double a = 3;

        s = s0 + v0 * t + 1 / 2 * a * (t * t);

        System.out.println(s);

    }

    public static void value2OfPhyiscs() {
        double s;
        double t = 2;
        double s0 = 5.1;
        double v0 = 3.2;
        double a = 2.3;

        s = s0 + v0 * t + 1 / 2 * a * (t * t);

        System.out.println(s);

    }

    public static void value3OfPhyiscs() {
        double s;
        double t = 3;
        double s0 = 6.2;
        double v0 = 4.1;
        double a = 3;

        s = s0 + v0 * t + 1 / 2 * a * (t * t);

        System.out.println(s);

    }

    public static void repeatPhysicseqn() {
        value1OfPhyiscs();
        System.out.println();
        value2OfPhyiscs();
        System.out.println();
        value3OfPhyiscs();
        System.out.println();
    }

}
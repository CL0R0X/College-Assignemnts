public class Jack {
    public static void main(String[] args) {
        System.out.println("This is the house that Jack built. \n");
        System.out.println("This is the malt");
        built();
        System.out.println("This is the rat");
        mbuilt();
        System.out.println("This is the cat");
        rmbuilt();
        System.out.println("This is the dog");
        crmbuilt();
        System.out.println("This is the cow with the crumpled horn,");
        dcrmbuilt();
        System.out.println("This is the maiden all forlorn");
        System.out.println("That milked the cow with the crumpled horn,");
        dcrmbuilt();

    }

    public static void built() {
        System.out.println("That lay in the house that Jack built.");
        System.out.println();
    }

    public static void rat() {
        System.out.println("That killed the rat,");
    }

    public static void dog() {
        System.out.println("That tossed the dog,");
    }

    public static void cat() {
        System.out.println("That worried the cat,");
    }

    public static void malt() {
        System.out.println("That ate the malt");
    }

    public static void mbuilt() {
        malt();
        built();
    }

    public static void rmbuilt() {
        rat();
        mbuilt();
    }

    public static void crmbuilt() {
        cat();
        rmbuilt();
    }

    public static void dcrmbuilt() {
        dog();
        crmbuilt();
    }


}

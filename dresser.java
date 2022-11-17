public class dresser {
    //Number of times should the dresser should increase in size
    static int UPGRADE_FACTOR = 2;

    // Number of drawers
    static int totalDrawers = 4;

    // Number of drawers used
    static int usedDrawers = 0;

    // Contents of drawers
    static String[] drawerContents = new String[totalDrawers];


    /**
     * Adds an item to a drawer; each drawer can contain only one kind of items.
     *
     * @param item String with kind of items contained in drawer.
     */
    public static void addToDrawer(String item) {
        // Make sure there is still empty drawers in the dresser
      /*  if (usedDrawers < totalDrawers) {
            // Add the item to the first available drawer

        } else {
            // We are here because used == total therefore out of space
            drawerContents =upgradeDresser(drawerContents);
        }

       */
        drawerContents[usedDrawers] = item;
        // Increase the number of used drawers.
        usedDrawers++;
    }  // method addToDrawer
    /*
    Creates new dresser with more space that given dresser
    @param oldDresser String[ with contents to upgrade
    @return String[] with new larger method
     */

    public static String[] upgradeDresser(String[] oldDresser){
        String[] newDresser = new String[UPGRADE_FACTOR *oldDresser.length];
        for(int i =0; i < oldDresser.length; i++){
            newDresser[i]= oldDresser[i];
        }
        return  newDresser;
    }

    /**
     * Clears the most recently used drawer.
     *
     * Method checks first that there is at least one drawer used.
     */
    public static void removeFromDrawer() {
        // Make sure that there is at least one drawer used.
        if (usedDrawers > 0) {
            // Empty the contents of the most recently used drawer
            drawerContents[usedDrawers-1] = null;
            // Reduce the number of used drawers
            usedDrawers--;
        }
    }  // method removeFromDrawer


    /**
     * Displays contents of dresser
     */
    public static void showContents() {
        System.out.printf("\n\nYour dresser has %d drawers with the following items:\n", totalDrawers);
        for (int i = 0; i < drawerContents.length; i++) {
            System.out.printf("\tDrawer %d: %s\n",i+1,drawerContents[i]);
        }
    }  // method showContents

    /** Test code */
    public static void main(String[] args) {
        addToDrawer("Socks");
        addToDrawer("Tee-shirts");
        addToDrawer("Cufflinks");
        addToDrawer("Bowties");
        addToDrawer("Bowties");
        showContents();
    }  // method main

}  // class Dresser
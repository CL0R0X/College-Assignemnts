public  class prototype {
    public static void main(String[] args) {
        String[] array1 = new String[5];
        array1[3] = "1";
        array1[1] = "e";
        array1[2] = "a";
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        int n = 2;
        for(int i =0; i <n; i++) {
            for (int j = 0; j< array1.length-1; j++) {
                array1[j] = array1[j +1];
            }
        }
        System.out.println("new");
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
    }
}
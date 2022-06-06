public class Program {

    public static void main(String[] args) {

        String[] names = new String[5];

        names[0] = "Fernando";
        names[1] = "Robert";
        names[2] = "Henry";
        names[3] = "Gerald";
        names[4] = "John";

//        System.out.println(names[3]);

        // For
        for(int i = 0; i < names.length; i++) {
            System.out.println("Hello, " + names[i]);
        }

//        While
        int j = 0;
        while (j < names.length) {
            System.out.println("Hello, " + names[j]);
            j++;
        }

        // For each
        int i = 0;
        for(String n: names) {
            System.out.println("Index[" + i + "]:" + n);
            i++;
        }

    }

}

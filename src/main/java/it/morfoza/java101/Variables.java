package it.morfoza.java101;


public class Variables {

    static byte b1;
    static short s1;
    static int i1;
    static long l1;

    static char c1;
    static float f1;
    static double d1;

    static boolean bool;
    static Object o1;

    public static void main(String[] args) {


        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(c1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(bool);
        System.out.println(o1);

        byte b2 = 5;
        short s2 = 6;
        int i2 = 7;
        long l2 = 8;

        char c2 = 4;
        float f2 = 5f;
        double d2 = 3.3d;
        boolean bool2 = true;
        Object o2 = null;


        float f1 = 4f;
        if (f1 == c2) {
            System.out.println("very nice");
        } else {
            System.out.println("very bad");
        }

        char c1 = 4;
        if (c1 == c2) {
            System.out.println("very nice");
        } else {
            System.out.println("very bad");
        }


       short s1 = 10;
        if (s1 == c1) {
            System.out.println("OK");
        } else {
            System.out.println("cokolwiek");
        }

        boolean bool = true;
        if (bool == bool) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }

        int znak = 'ć';
System.out.println(znak);
    }
}

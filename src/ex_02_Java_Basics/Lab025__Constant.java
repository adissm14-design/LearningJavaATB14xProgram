package ex_02_Java_Basics;

public class Lab025__Constant {
    public static void main(String[] args) {
        int a = 10;
        a = 11;
        System.out.println(a);
        final int b = 99;
//        b = 100;
//        System.out.println(b); java: cannot assign a value to final variable b
        System.out.println(b);
        final float PI = 3.14f;
        System.out.println(PI);
    }
}

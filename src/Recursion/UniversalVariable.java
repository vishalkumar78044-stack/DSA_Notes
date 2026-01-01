package Recursion;

public class UniversalVariable {
    static int x =5;
    public static void main(String[] args) {
        System.out.println(x);
        x = 30;
        fun();

    }
    public static void fun(){
        System.out.println(x);

    }
}

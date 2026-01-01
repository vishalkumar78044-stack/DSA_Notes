package Methods;

public class _02_fun {
    public static void max(int a , int b, int c){  //parameter
        if(a >= b && a >= c) System.out.println(a);
        else if (b >= a && b >= c) System.out.println(b);
        else System.out.println(c);

    }

    public static void sum(int a , int b, int c){  //parameter
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        sum(3,6 ,8);  //arguments
        max(34,4,86);
    }
}

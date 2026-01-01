package Recursion;

import java.util.Scanner;

public class Recursion03 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fun(1);
    }
    public static void fun(int x){
        if(x>n) return;
        System.out.print(x+" ");
        fun(x+1);

    }
}

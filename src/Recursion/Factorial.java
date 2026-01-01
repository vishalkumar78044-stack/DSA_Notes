package Recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = fac(a);
        System.out.println(ans);

    }
    public static int fac(int a){
        if(a==0 || a==1) return 1;
        return a*fac(a-1 );

    }
}

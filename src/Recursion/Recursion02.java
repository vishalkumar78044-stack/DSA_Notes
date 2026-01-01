package Recursion;

import java.util.Scanner;

public class Recursion02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ajay(1,n);
    }
    public static void ajay(int x,int n){
        if(x>n) return;
        if(x%10==0) System.out.println();
        System.out.print(x+" ");
        ajay(x+1,n);
        System.out.print(x+" ");
        if(x%10==0) System.out.println();
    }
}

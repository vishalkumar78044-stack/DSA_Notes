package Recursion;

import java.util.Scanner;

public class Recursion01 {
    public static void main(String[] args) {
        ajay(1);
    }
    public static void ajay(int n){
        if(n==10) return;
        if(n != 9)System.out.print(n+" ");
        ajay(n+1);
        System.out.print(n+" ");
    }
}

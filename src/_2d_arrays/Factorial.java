package _2d_arrays;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fac = 1;
        for(int i=1; i<=a;i++){
            fac = i * fac;
        }
        System.out.println("Factorial is : "+fac);
    }
}

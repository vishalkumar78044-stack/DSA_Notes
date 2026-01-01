package Recursion;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first no : ");
        int a = sc.nextInt();
        System.out.print("Enter your second no : ");
        int b = sc.nextInt();
        int ans = -1;
        int i =1;
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0) ans = i;
            i++;
        }
        System.out.println(ans);
    }
}

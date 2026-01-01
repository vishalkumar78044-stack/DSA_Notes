import java.util.Scanner;

public class Study_tool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no. :");
        int a = sc.nextInt();
        int ans1 = (a*a+2)/2;
        System.out.println("sum of n number : "+ ans1);
        int ans2 = (a*a-2)/2;
        System.out.println("max no. of uncyclic vertex is :"+ans2);

    }
}

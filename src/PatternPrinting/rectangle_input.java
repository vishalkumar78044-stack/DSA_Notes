package PatternPrinting;

import java.util.Scanner;

public class rectangle_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter colomb: ");
        int a = sc.nextInt();
        System.out.print("enter row: ");
        int b = sc.nextInt();

        for(int i=1; i<=b; i++){
            //System.out.print("$");
            for(int j=1; j<=a; j++){
                System.out.print("*");

            }
            System.out.println(" ");
        }


    }
}

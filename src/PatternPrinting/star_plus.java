package PatternPrinting;

import java.util.Scanner;

public class star_plus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter square side: ");
        int a = sc.nextInt();
        int c = a+1/2;


        for (int i = 1; i <= a; i++) {
            //System.out.print("$");
            for (int j = 1; j <= a; j++) {

                if(i == c  || j == c) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }




            }
            //System.out.print( "*" + "  ");
            System.out.println(" ");
        }

    }
}

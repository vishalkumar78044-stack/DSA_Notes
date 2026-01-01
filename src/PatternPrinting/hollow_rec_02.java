package PatternPrinting;

import java.util.Scanner;

public class hollow_rec_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter square side: ");
        int a = sc.nextInt();


        for (int i = 1; i <= a; i++) {
            //System.out.print("$");
            for (int j = 1; j <= a; j++) {

                if (i == 1 || j == 1 || i == a || j == a) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }


            }
            //System.out.print( "*" + "  ");
            System.out.println(" ");
        }

    }
}

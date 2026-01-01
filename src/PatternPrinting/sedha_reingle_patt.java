package PatternPrinting;

import java.util.Scanner;

public class sedha_reingle_patt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter square side: ");
        int a = sc.nextInt();


        for (int i = 1; i <= a; i++) {
            //System.out.print("$");
            for (int j = 1; j <= i; j++) {

                System.out.print( "*" + "  ");

            }
            System.out.println(" ");
        }

    }
}

package PatternPrinting;

import java.util.Scanner;

public class nu_count_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side of no. pattern: ");
        int a = sc.nextInt();


        for(int i=1; i<=a; i++){
            //System.out.print("$");
            for(int j=1; j<=a; j++){
                System.out.print(j+" ");

            }
            System.out.println(" ");
        }


    }
}

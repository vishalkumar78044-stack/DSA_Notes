package Arre;

import java.util.Scanner;

public class max_var_arre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vishal = {23,65,67,34,86,24,65};
        int a = 0;
        int i = 0;
        while(i < 6){
            i++;
            if(a < vishal[i]){
                a = vishal[i];

            }

        }
        System.out.println(a);

        int sum = 0;
//        while (i<6){
//            sum += vishal[i];
//
//            i++;
//        }
//        System.out.println("sum of vishal is :");
//        System.out.println(sum);

        for (int c=0; c< vishal.length; c++){
            sum += vishal[c];
        }
        System.out.println(sum);
    }
}

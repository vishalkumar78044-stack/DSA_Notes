package Arre;

import java.util.Scanner;

public class output_inputa_arr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,23,56,76,3,55,34,8};
        //print length of arre
        // jab bhi ham khali arr banate hai usaka har element 0 hota hai
//        System.out.println(arr.length);
//        int i = 0;
//        while(i < arr.length){
//            System.out.print(arr[i]+" ");   // wrong method used by me
//            i++;
//        }


        //method 01 for input in arre


        int[] vishal = new int[6];
//        for(int i=0;i<6;i++){
//          //  vishal[i] = sc.nextInt();
//            int x = sc.nextInt();
//            vishal[i] = x;
//        }
//        int i = 0;
//        while(i<6){
//            System.out.print(vishal[i]+" ");
//            i++;
//        }

        // method 2 for input in arre

        for(int i=0;i<6;i++){
            vishal[i] = sc.nextInt();
            System.out.print(vishal[i]+" ");
        }


    }
}

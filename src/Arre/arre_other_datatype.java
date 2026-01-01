package Arre;

import java.util.Scanner;

public class arre_other_datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.println(arr[4]);

        String[] vishal = {"vishal", "harsh", "anushka", "rudra"};
        int i = 0;
        while (i < vishal.length){
            System.out.print(vishal[i]+" ");
            i++;

        }
        String[] shubham = new String[6];
        while (i< shubham.length){
            System.out.println("Enter name" + (i+1) + ": ");
            shubham[i] = sc.nextLine();
            i++;
            System.out.print(shubham[i] + " ");
        }




    }

}

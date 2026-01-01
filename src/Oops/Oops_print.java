package Oops;

import java.util.Scanner;

public class Oops_print {
    public static class Car{
        int seats;
        String name;
        String type;
        void print(Car c){
            System.out.println(c.seats+" "+c.name+" "+c.type);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car c1 = new Car();
        c1.seats = sc.nextInt();
        c1.name = "kia sonet";
        c1.type = "suv";

        Car c2 = new Car();
        c2.seats = 2;
        c2.name = "Tata naino";
        c2.type = "mini suv";


        c1.print(c2);
    }
}

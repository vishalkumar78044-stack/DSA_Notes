package Oops;

import java.util.Scanner;

public class OopsMathodPrint {
    public static class Car{
        int seats;
        String name;
        String type;
        void print(){
            System.out.println(seats+" "+name+" "+type);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car c = new Car();
        c.seats = sc.nextInt();
        c.name = "kia sonet";
        c.type = "suv";

        c.print();
    }
}

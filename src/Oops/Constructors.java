package Oops;

import PatternPrinting._aa_bb_char_print;

public class Constructors {
    public static class car{
        int seats;
        String name;
        double length;
        //yaha hamane car ke 3 method banaye hai this is called methodo verloding
        car(int x ,String s,double d){
            seats = x;
            name = s;
            length = d;
        }
        car(String s, int x , double d){
            seats = x;
            name = s;
            length = d;
        }
        car(){   // if we don't creat any constructure then it is by defalt constructure

        }
        void print(car c){
            System.out.println(seats+" "+name+" "+length);
        }

    }

    public static void main(String[] args) {
        car c1 = new car(4,"kia sonic",4.55);
        c1.print(c1);
        car c2 = new car();
        car c3 = new car("thar", 4, 3.99);

    }
}

package Oops;


import java.util.Scanner;

class Student{  // defalt values are
    String name;    // null
    private int rno;   //0
    double cgpa;   //0.0

    private void print(){   // i can't access this one bcz it is privet
        System.out.println(name+" "+rno+" "+cgpa);
        //but we can access it through another function which is in
        // same function like "print2" function
    }
    void print1(){
        System.out.println(name+" "+cgpa+" "+rno);
    }
    void print2(){
        print();
    }

}
public class PrivetKeyWord {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.cgpa = 23.3;
        s1.name = "vishal";
//        System.out.println(s1.rno);
//        s1.print();
        s1.print1();
        s1.print2();

       // s1. rno = 23;  //we can't access it or change it bcz it is privet now
    }
}

package Oops;

public class Oops_01 {
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "vishal kuamr";
        s1.rno = 23;
        s1.cgpa = 8.3;

        Student s2 = new Student();
        s2.name = "shubham kumar";
        s2.cgpa = 8.4;
        s2.rno = 43;

        System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno);
        s2.rno = 87;
        System.out.println(s2.rno);
    }

}

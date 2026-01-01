package Methods;

public class return_type {
    public static int vishal(int a) {
        System.out.println("vishl is very strong");
//        return 8; //khatam tata bye bye

        if(a > 0) return 7;
        else return 10;

    }

    public static void main(String[] args) {
//        System.out.println(vishal());
//        System.out.println(3 + vishal());
        int x = vishal(9);
        System.out.println(3+x);
    }
}

package copy;

public class Deep_copy {
    public static void main(String[] args) {
        //Deep copy
        //change does not effect original
        int a = 10;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        b = 20;
        System.out.println(b);
        System.out.println(a);
        // shallow or deep copy SAME
    }
}

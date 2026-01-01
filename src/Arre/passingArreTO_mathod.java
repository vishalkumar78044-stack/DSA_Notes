package Arre;

public class passingArreTO_mathod {
    public static void main(String[] args) {
        int x[] = {10,34,24,8,58,34};
        change(x);
        System.out.println(x[2]);
    }

    public static void change(int[] x) {
        x[2] = 300;

    }
}

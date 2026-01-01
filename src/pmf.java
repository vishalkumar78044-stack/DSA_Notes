import java.util.Scanner;

public class pmf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no : ");
        int a = sc.nextInt();
        System.out.print("Enter second no : ");
        int b = sc.nextInt();
        System.out.println(choo(a,b));

    }
    public static int choo(int c , int d){
        int f = c-d;
        int ans1= fact(c)/fact(d)*fact(f);
        return ans1;
    }
    public static int fact(int e){
        if(e == 1 || e == 0) return 1;
        int ans = 1;
        for(int i = 1; i<=e; i++){
            ans = ans * i;
        }return ans;

    }
}

package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v = sc.next();
        int i =0;
        int j = v.length() - 1;
        boolean m = true;
        while (i<=j){
            if(v.charAt(i) != v.charAt(j)){
                m = false;
//                i++;
//                j--;
            }
//            else m=true;
            i++;
            j--;
        }
        System.out.println(m);
    }
}

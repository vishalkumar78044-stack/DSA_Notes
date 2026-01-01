package Strings;

public class ReverseDelet {
    public static void main(String[] args) {
        String s = "devesh";
//        we can delet in stringBuilder only not
//        in string
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(2);
        sb.insert(2,'l');
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println("delet :" + sb);


        //reverse
        sb.reverse();
        System.out.println(sb);
    }
}

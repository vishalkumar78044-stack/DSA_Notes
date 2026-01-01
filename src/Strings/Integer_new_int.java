package Strings;

public class Integer_new_int {
    public static void main(String[] args) {

//        is case me new char ban raha hai and
//        is liye inka address alag hai (diffrent)
//        address compair karane paar false aa raha hai
        String s1 = new String("vishal");
        String s2 = new String("vishal");
//        System.out.println(s1);
//        System.out.println(s2);

//        in this case ek he char ban raha hai but
//        usaka s3 and s4 addresss hai and address compair
//        ho raha hai
        String s3 = "shubham";
        String s4 = "shubham";
        System.out.println(s1==s2);
        System.out.println(s1.charAt(0)==s2.charAt(0));
//        System.out.println(s3);
//        System.out.println(s4);
        System.out.println(s3==s4);
        System.out.println(s3.charAt(0)==s4.charAt(0));

    }
}

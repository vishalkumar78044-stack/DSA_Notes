package Strings;

public class buildInString03_add_int_string {
    public static void main(String[] args) {
        String s = "vishal";
        s += 10;
        s += 'a';
        System.out.println(s);

        String b = "shubham";
        b += 12;
        b += 2;
        b += '\n';
        b += 3;
        System.out.println(b);

        String c = "lucky";
        String d = 10 +24 + c;
        System.out.println(d);


        //most important things
        System.out.println("vishal"+10+20);
        System.out.println(10+"vishal"+20);
        System.out.println(10+20+"vishal");
        System.out.println('A'+2+"vishal");
    }
}

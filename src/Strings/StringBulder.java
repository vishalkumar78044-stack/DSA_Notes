package Strings;

public class StringBulder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("vishal");
        System.out.println(s);
        System.out.println(s.length()+" " +s.capacity());
        s.append(" kumar");
        System.out.println(s);
        System.out.println(s.length()+" " +s.capacity());
        StringBuilder v = new StringBuilder("");
        System.out.println(v.length()+" " +v.capacity());
        s.setCharAt(3,'w');
        System.out.println(s);

//  if you wan to make new string (like copy)
//        string t =s;
//        you can't do this ok
        String t = s.toString();
        System.out.println("t is :" + t);

    }
}
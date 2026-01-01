package Strings;

public class subString {
    public static void main(String[] args) {
//        String s = "vishal";
//        System.out.println(s);
//        s = "kumar";
//        System.out.println(s);
//        s.charAt(0) = 'i';
        //not possible string ke andar
        // change nahe kar sakate
//        System.out.println(s);


        String v = "vishal kumar maddeshiya";
        for(int j=0;j< v.length(); j++){
            for(int i=j; i<= v.length(); i++) {
                System.out.print(v.substring(j, i)+" ");
            }
            System.out.println();
        }
    }
}

package Strings;

public class no_of_vowels {
    public static void main(String[] args) {
        String s = "vishal kumar";
        int j = 0;
        for (int i = 0; i < 12; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                j++;
        }
        System.out.print(j);
    }
}

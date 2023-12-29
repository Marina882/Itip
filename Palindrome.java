import java.util.Arrays;
public class Palindrome {
    public static void main(String[] args) {

        for (int i = 0; i<args.length; i++) {
            String s = args[i];
            System.out.println(s + " " + reverseString(s) + " " + isPalindrome(s));
        }
    }

    public static String reverseString(String s) {

        String a = "";
    
        for (int i = s.length()-1; i >= 0; i--) {
            a = a + s.charAt(i);
        }
        return a;
    
    }
}


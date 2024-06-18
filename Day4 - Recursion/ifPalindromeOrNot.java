package Day4;
import java.util.*;
public class ifPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = "Hello";
        //String k = "asdfggfdsa";
        String s = sc.nextLine();
        System.out.println(check(s));
        sc.close();
    }

    public static boolean check(String str) {
        // base case
        if (str.length() == 0 || str.length() == 1)
            return true;

        if (str.charAt(0) != str.charAt(str.length()-1))
        return false;
        return check(str.substring(1, str.length()-1));
    }
}

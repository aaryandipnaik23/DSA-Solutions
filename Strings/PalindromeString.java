import java.util.*;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = 0, j = s.length() - 1;
        boolean isPalindrome = true;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++; j--;
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}

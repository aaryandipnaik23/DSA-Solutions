import java.util.*;

public class AnagramCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            sc.close();
            return;
        }

        int freq[] = new int[26];
        for(char c : s1.toCharArray())
            freq[c - 'a']++;
        for(char c : s2.toCharArray())
            freq[c - 'a']--;

        for(int x : freq){
            if(x != 0){
                System.out.println("Not Anagram");
                sc.close();
                return;
            }
        }

        System.out.println("Anagram");
        sc.close();
    }
}

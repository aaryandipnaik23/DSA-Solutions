import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";
        boolean seen[] = new boolean[256];

        for(char c : s.toCharArray()){
            if(!seen[c]){
                seen[c] = true;
                result += c;
            }
        }

        System.out.println(result);
        sc.close();
    }
}

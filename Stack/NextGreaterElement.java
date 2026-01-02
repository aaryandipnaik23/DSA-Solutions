import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        int nge[] = new int[n];

        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        for(int x : nge)
            System.out.print(x + " ");

        sc.close();
    }
}

import java.util.Scanner;
import java.util.Stack;

public class KillerMonsters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = scanner.nextInt();
            }
            
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && st.peek() <= v[i]) {
                    st.pop();
                }
                st.push(v[i]);
                System.out.print(st.size() + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}


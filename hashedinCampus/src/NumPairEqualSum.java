import java.util.*;

public class NumPairEqualSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        int num = in.nextInt();
        System.out.println(sumEqualPair(arr, m, num));
    }

    public static int sumEqualPair(int[] arr, int m, int num){
        Arrays.sort(arr);
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < m; j++) {
                if(arr[i]+arr[j]==num){
                    hs.add(arr[i]+" "+arr[j]);
                }
            }
        }
        return hs.size();
    }
}

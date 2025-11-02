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

        // max freq of element
        System.out.println(findMaxFreq(new int[]{1, 1, 1, 3, 4, 5, 6, 9, 3, 9, 4}));

        // sum of digits of each element of array after removing max and min digit from each element
        System.out.println(sum(new int[]{9876}));
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

    // finding the frequency of max occurrence of integer
    public static int findMaxFreq(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            max = Math.max(max, e.getValue());
        }
        return max;
    }

//    https://www.youtube.com/watch?v=KfcLjLa3qBw&list=PL8ZlG9t80aE3k1ifWAlklzRc6myBTnemk&index=3
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=digit(arr[i]);
        }
        return sum;
    }
    public static int digit(int n){
        int res = 0;
        int temp = n;
        ArrayList<Integer> al = new ArrayList<>();
        while (temp>0){
            int r = temp%10;
            al.add(r);
            temp/=10;
        }
        Collections.sort(al);
        for (int i = 1; i < al.size()-1; i++) {
            res = res + al.get(i);
        }
        return res;
    }
}

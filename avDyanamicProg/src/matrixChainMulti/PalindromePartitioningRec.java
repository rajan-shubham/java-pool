package matrixChainMulti;
//https://www.geeksforgeeks.org/dsa/palindrome-partitioning-dp-17/
//https://www.youtube.com/watch?v=szKVpQtBHh8&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=35
public class PalindromePartitioningRec {
    public static void main(String[] args) {
        String s = "geek";
        System.out.println(palindromePartition(s, 0, s.length()-1));
    }

    public static int palindromePartition(String s, int i, int j){
        if (i >= j) return 0;

        if (isPalindrome(s,i,j)) return 0;

        int min = Integer.MAX_VALUE;
        for(int k = i; k<=j-1; k++){
            int temp = 1 + palindromePartition(s, i, k) + palindromePartition(s, k+1, j);
            min = Math.min(min, temp);
        }

        return min;
    }
    private static boolean isPalindrome(String s, int start, int end){
        while (start < end) if (s.charAt(start++) != s.charAt(end--)) return false;
        return true;
    }
}

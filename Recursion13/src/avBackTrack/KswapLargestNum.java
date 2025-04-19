package avBackTrack;

//https://www.geeksforgeeks.org/problems/largest-number-in-k-swaps-1587115620/1
public class KswapLargestNum {
    public static void main(String[] args) {
        String s = "7212";
        int k = 2;
        System.out.println(findMaxNum(s, k)); // 7221
        System.out.println(findMaxNum("721", k)); // 721
        System.out.println(findMaxNum("5477", k)); // 7754
        System.out.println(findMaxNum("4577", k)); // 7754
    }

    // TC : work done at a node * no. of nodes
    // TC : O(n^2  *  n!/(n-k)!)
    public static String findMaxNum(String s, int k){
        String[] result = {s}; // wrapper
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        kthSwapMaxNum(digits, k, result, 0);
        return result[0];
    }
    private static void kthSwapMaxNum(int[] number, int k, String[] result, int start){
        if (k == 0 || start == number.length - 1) return;
        int max = number[start];
        for (int i = start+1; i < number.length; i++) {
            max = Math.max(max, number[i]);
        }
        boolean swapped = false;
        for (int i = start+1; i < number.length; i++) {
            if(number[i] == max && number[start] < number[i]){
                swap(number, start, i);

                String current = arrayToString(number); //proper lexicographical comparison
                if(current.compareTo(result[0]) > 0) result[0] = current;

                kthSwapMaxNum(number, k-1, result, start+1);
                swap(number, start, i); // backtrack
                swapped = true;
            }
        }
        if (!swapped) kthSwapMaxNum(number, k, result, start+1);
    }
    private static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int digit : arr) sb.append(digit);
        return sb.toString();
    }
    private static void swap(int[] number, int start, int i){
        int temp = number[start];
        number[start] = number[i];
        number[i] = temp;
    }
}

class Solution { //Courtesy to Aditya Verma's Backtracking Playlist
    //Function to find the largest number after k swaps.

    public static String findMaximumNum(String str, int k) {
        String [] max = {""};
        // max[0]="";
        findAllPossibleComb(str,k,0,max);
        return max[0];
    }
    private static void findAllPossibleComb(String str,int k, int index,String[] max){
        if(k==0 || index==str.length()-1){
            // arrz.add(str);
            if(str.compareTo(max[0])>0) max[0]=str;
            return ;
        }

        for(int i =index+1;i<str.length();i++){
            if(str.charAt(index)<str.charAt(i)){
                str = swap(index,i,str);
                findAllPossibleComb(str,k-1,index+1,max);
                str = swap(i,index,str);
            }
        }
        findAllPossibleComb(str,k,index+1,max);
    }
    private static String swap (int a, int b, String s){
        char[] myArray = s.toCharArray();
        char c = myArray[a];
        myArray[a]=myArray[b];
        myArray[b]=c;
        return new String (myArray);
    }
}

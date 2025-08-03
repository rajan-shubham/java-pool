import java.util.ArrayList;

public class TwoArrayNumberSum {
    public static void main(String[] args) {
        System.out.println("Sum two array as a number");

        int[] num1 = {9,5,4,9};
        int[] num2 = {2, 1, 4};

        ArrayList<Integer> result = addArrays(num1, num2);
        System.out.println(result);
    }

    public static ArrayList<Integer> addArrays(int[] num1, int[] num2){
        ArrayList<Integer> result = new ArrayList<>();
        int n = num1.length, m = num2.length;
        int carry = 0;

        for(int i=n-1, j=m-1; i>=0 || j>=0 || carry>0; i--, j--){
            int sum = (i>=0?num1[i]:0) + (j>=0?num2[j]:0) + carry;
            carry = sum/10;
            int digit = sum%10;
            result.add(0,digit);
        }
        return result;
    }
}

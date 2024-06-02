// leetcode --> 344 --> https://leetcode.com/problems/reverse-string/?envType=daily-question&envId=2024-06-02

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }


    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start <= end){
            swap(s, start, end);
            start ++;
            end --;
        }
    }

    public static void swap(char[] s, int start, int end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
}

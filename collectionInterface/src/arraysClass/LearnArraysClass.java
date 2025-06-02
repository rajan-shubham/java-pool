package arraysClass;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(num, 7);
        System.out.println("Index of element 7 in the array is: " + index);

        Integer[] nums = {23, 34, 11, 7, 87, 33, 12, 76, 98};
        Arrays.sort(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }

        int[] arr = new int[10];
        Arrays.fill(arr, 69);
        System.out.println(arr[9]);
    }
}

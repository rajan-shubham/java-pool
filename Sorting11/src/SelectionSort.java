import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,-32,0,78,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    // SELECTION SORT -> select an element and put it at it's right position(correct position)
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length -i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            // swap element which is a maxIndex and the current last element
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

}

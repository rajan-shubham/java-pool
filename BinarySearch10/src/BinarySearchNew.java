import java.util.*;

public class BinarySearchNew{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {-3,-2,-1,10,20,30,40,50,60,70,80,90,100, 150, 190, 200, 250};
        System.err.println("Which element's index you want to find from this Array : " + Arrays.toString(arr));
        int target = in.nextInt();
        System.out.println("Index at which 10 is present is : " + searchTarget(arr, target));
    }

    private static int searchTarget(int[] arr, int target){
        int start = 0, end = arr.length;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1; 
    }
}

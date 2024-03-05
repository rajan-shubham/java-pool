public class BinarySearchRecur {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15};
        int target = 11;
        System.out.println(binarysearch(arr,target,0,arr.length-1));
        System.out.println(search(arr,target,0,arr.length-1));

    }

    static int binarysearch(int[] arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length - 1;
        if (start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
//        int mid = arr.length/2;
        if(arr[mid] == target){
            return mid;
        }else if (arr[mid] > target){
            return binarysearch(arr, target, start, mid - 1);
        }else {
            return binarysearch(arr, target, mid + 1, end);
        }
    }


    static int search(int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target){
            return m;
        }
        if (target < arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}

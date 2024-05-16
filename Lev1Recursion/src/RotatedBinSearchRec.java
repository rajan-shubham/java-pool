public class RotatedBinSearchRec {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rbsrecursion(arr,9, 0, arr.length - 1));
    }

    static int rbsrecursion(int[] arr, int key, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == key){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(key >= arr[start] && key <= arr[mid]){
                return rbsrecursion(arr, key, start, mid-1);
            }else{
                return rbsrecursion(arr, key, mid+1, end);
            }
        }

        if(key >= arr[mid] && key <= arr[end]){
            return rbsrecursion(arr, key, mid+1, end);
        }
        return rbsrecursion(arr, key, start, mid-1);
    }
}

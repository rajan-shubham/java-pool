public class MoveAllZeroToEnd {
    void pushZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != j) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
                j++;
            }
        }
    }
}

/*
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int k = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[k] = arr[i];

                k++;
            }
        }

        while(k < arr.length){
            arr[k] = 0;
            k++;
        }
    }
}


class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int size = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i<size; i++){
            if(arr[i] > 0) al.add(arr[i]);
        }
        int k = 0;
        for(Integer elem : al){
            arr[k++] = elem;
        }
        for(int i = k; i<size; i++){
            arr[i] = 0;
        }
    }
}
*/
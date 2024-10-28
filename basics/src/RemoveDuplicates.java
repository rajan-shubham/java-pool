import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1

public class RemoveDuplicates {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                continue;
            }else if(!result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        if(!result.contains(arr[arr.length-1])){
            result.add(arr[arr.length-1]);
        }
        return result;
    }
}

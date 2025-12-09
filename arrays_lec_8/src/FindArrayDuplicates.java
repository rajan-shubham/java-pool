import java.util.*;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/1851278034/
//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1

public class FindArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        ArrayList<Integer> duplicates = findDuplicates(arr);
        for (int i = 0; i < duplicates.size(); i++) {
            System.out.println(duplicates.get(i));
        }
    }

    public static ArrayList<Integer> findDuplicates(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) +1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if (entry.getValue() > 1) al.add(entry.getKey());
        }
        return al;
    }
}

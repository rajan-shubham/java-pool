import java.util.*;

class MergeTwoSortedArr {
  // https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-with-distinct-elements/1
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : a)  set.add(i);
        for(int j : b)  set.add(j);
        for(int i : set) list.add(i);
        return list;
    }
}

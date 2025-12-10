import java.util.ArrayList;
// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
public class FindMissingRpeating {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> al = findTwoElement(arr);
        for(Integer elem: al) System.out.println(elem);
    }

    public static ArrayList<Integer> findTwoElement(int[] arr){
        int[] n = new int[arr.length + 1];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            n[arr[i]]++;
        }
        for (int i = 1; i < n.length; i++) {
            if (n[i] == 2) al.add(i);
        }
        for (int i = 1; i < n.length; i++) {
            if (n[i] == 0) al.add(i);
        }
        return al;
    }
}

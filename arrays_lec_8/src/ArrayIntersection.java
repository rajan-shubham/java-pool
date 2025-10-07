import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        // Use a HashSet to store elements of the first array for efficient lookup
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        // Use another HashSet to store the intersection elements to avoid duplicates in the result
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the intersectionSet to an int array
        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 1, 5, 8};
        int[] array2 = {2, 2, 8, 9, 4};

        int[] intersection = findIntersection(array1, array2);

        System.out.print("Intersection of the two arrays: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

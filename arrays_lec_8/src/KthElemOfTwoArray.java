//https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
public class KthElemOfTwoArray {
    public int kthElement(int[] a, int[] b, int k) {
        int alen = a.length;
        int blen = b.length;
        int i = 0, j = 0, count = 0, min = 0;

        // Iterate until k elements are counted
        while (count < k) {
            // Check if array 'a' is exhausted or if current element in 'b' is smaller
            if (i == alen) {
                min = b[j];
                j++;
            }
            // Check if array 'b' is exhausted or if current element in 'a' is smaller
            else if (j == blen) {
                min = a[i];
                i++;
            }
            // Compare current elements of both arrays and pick the smaller one
            else if (a[i] <= b[j]) {
                min = a[i];
                i++;
            } else {
                min = b[j];
                j++;
            }
            count++;
        }
        return min;
    }
}

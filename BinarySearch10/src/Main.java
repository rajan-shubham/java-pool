public class Main {
    public static void main(String[] args) {
        System.out.println("BINARY SEARCH");
        // Getting a sorter array of elements & a target element.
        //1> find the middle element
        //2> target element > mid -> search in the right else search in left
        //3> if the middle element == target element -> answer we get.

        // Take 2 pointer 1> int start = 0; 2> int end = array.length() - 1; int mid = (start + end)/2;

        // middle elem < target elem -> start = mid+1;
        // middle elem > target elem -> end = mid-1;

        // if start > end -> element not found
    }
}
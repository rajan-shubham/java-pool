import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        // String are NON-MUTABLE but Arrays ar mutable in java
        // mutable in java means -> you can change the object
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}

import java.util.Arrays;

public class CheckRefrence {
    public static void main(String[] args) {
        int age = 30;
        int oldAge = age; // only the value is going not the reference or address(as integer is primitive data type)
        age = 31;
        System.out.println(age); // 31
        System.out.println(oldAge); // 30

        int[] arr = {1,2,3,4,5};
        int[] newArr = arr;
        arr[4] = 500;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
        if(arr == newArr){
            System.out.println("Equal");
        }
    }
}

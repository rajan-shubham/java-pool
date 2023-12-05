import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // variable length argument -> when you create a method that takes variable no. of arguments.
        //                          -> when we don't know how many inputs we are giving
//        fun(2,3,4,5,56,87,23,45,65);
//        fun();
//        multiple(2 , 3, "shubham" ,"prince" ,"anurag" ,"ajat");
        demo(2, 4, 6);
        demo("shubham", "hello");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){ // this fun take 0 or 1 or many argument and store it internally as an array
        System.out.println(Arrays.toString(v));
    }
}

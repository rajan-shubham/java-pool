public class Main {
    public static void main(String[] args) {
        // Why we need array ?
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "shubham kumar";

        // Q: store 5 roll no.
        int roll1 = 23;
        int roll2 = 55;
        int roll3 = 18;

        // Array : it is a collection of same datatype element
        // syntax
        // datatype[] variable_name = new datatype[size];
        // new keyword is used to create an object
        int[] rnos =  new int[5];
        // or directly
        int[] rnos2 = {23, 12, 45, 32, 15}; // all datatype should be same

        int[] ros; // declaration of array. ros is getting defined in the stack -> right now its default value is going to be null
        ros = new int[5]; // initialisation : actually here object is being created in the memory (heap)

        ros[1] = 33;
        System.out.println(ros[1] + ros[0]);

        // new keyword : basically just means it is used to create an object

        String[] arr1 = new String[4];
        System.out.println(arr1[0]);

        //1-> array object are in heap
        //2-> heap objects are not continuous
        //3-> dynamic memory allocation
        // Hence array objects in java may not be continuous -> depends on JVM

        String str = null;
        //int num = null; -> this is wrong -> null is similar with none in python, null is literal
        //                -> null is special value i.e. by default value what reference variable points to

        //primitives are stored in stack memory but all the other objects like String type,Array type,your own type,
        //   Hashmap all the other thing like the classes we are making are stored in HEAP Memory.

        String[] arr = new String[5]; // Finding internal working of object arrays not primitives array
    }
}

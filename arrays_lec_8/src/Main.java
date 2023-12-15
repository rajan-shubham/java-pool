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
        int[] rnos =  new int[5];
        // or directly
        int[] rnos2 = {23, 12, 45, 32, 15}; // all datatype should be same

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation : actually here object is being created in the memory (heap)

        ros[1] = 33;
        System.out.println(ros[1] + ros[0]);

        // new keyword : basically just means it is used to create an object

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}

package access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(34, "shubham");

        // need to do a few things
        // 1. access the data members.
        // 2. modify the data members.

//        ArrayList<Integer> list = new ArrayList<>(23);
//        list.DEFAULT_CAPACITY;

        System.out.println(obj.getNum());
    }
}

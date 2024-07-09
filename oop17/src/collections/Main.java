package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(54);
        list2.add(78);
        list2.add(55);

        System.out.println(list2);

        // vector -> more synchronize (means only one thread can access it at a time)
        List<Integer> vector = new Vector<>();

        vector.add(3);
        vector.add(15);
        vector.add(5);
        vector.add(18);

        System.out.println(vector);

        //enum --> for a particular class you need a particular number of objects only
        // ex of enum is Month class where only 12 objects (January - December)

    }
}

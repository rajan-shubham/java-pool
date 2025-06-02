package listInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        /*
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("shubham", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));
        studentSet.add(new Student("rajan", 2));

        System.out.println(studentSet);
        */
        /*
        Student s1 = new Student("amit",2);
        Student s2 = new Student("rohit",2);
        System.out.println(s1.equals(s2));
         */


        /*
        Set<Integer> set = new HashSet<>(); // all operation O(1)
        // make a hash of every element and store there reference uniquely
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);

        System.out.println(set.remove(5)); // first find and then remove, if not present the return false
        System.out.println(set);
        System.out.println(set.contains(211)); // bool <-- find whether present or not

        System.out.println(set.isEmpty());
        System.out.println(set.size()); // [32, 65, 2, 21, 54]

        set.clear();
        System.out.println(set);



        Set<Integer> newSet = new LinkedHashSet<>();
        // same, but elements are added one by one (maintain the order in which they added)
        System.out.println(newSet.add(99));
        for (int i = 0; i < 5; i++) {
            newSet.add(i);
        }
        System.out.println(newSet); // [99, 0, 1, 2, 3, 4]



        // Sorted Set
        Set<Integer> sortedSet = new TreeSet<>(); // all operation O(log N) add, remove, find
        // it do everything in sorted form (implemented in Binary Search Tree)
        sortedSet.add(32);
        sortedSet.add(2);
        sortedSet.add(54);
        sortedSet.add(21);
        sortedSet.add(65);
        System.out.println(sortedSet); // [2, 21, 32, 54, 65]
        */
    }
}

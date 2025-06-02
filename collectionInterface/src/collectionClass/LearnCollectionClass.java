package collectionClass;

import listInterface.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Shubham", 2));
        list.add(new Student("Ramesh", 4));
        list.add(new Student("Shivam", 3));
        list.add(new Student("Rajan", 1));

        Collections.sort(list);
        System.out.println(list);

        ///  checking my compare to function written in my Student class
        Student s1 = new Student("aman", 2);
        Student s2 = new Student("anand", 3);
        System.out.println(s1.compareTo(s2));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name); // for working of this line i changed name property of Student to public
            }
        });
        System.out.println(list);




//        List<Integer>  list = new ArrayList<>();
//        list.add(34);
//        list.add(12);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(76);
//        list.add(29);
//        list.add(75);
//        list.add(39);
//        list.add(94);

//        System.out.println("min element: " + Collections.min(list));
//        System.out.println("max element: " + Collections.max(list));
//        System.out.println(Collections.frequency(list, 9));

//        Collections.sort(list);
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);
    }
}

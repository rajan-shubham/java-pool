package introduction;

import java.util.Arrays;

public class StudentClass {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 student names
        String[] nameStudent = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // a class is a named group of properties and function
        Student[] students = new Student[5];

        Student kunal; // declaring reference variable (object of Student class)

        System.out.println(Arrays.toString(students));
    }

    // class is like a logical construct or template(written RULE) & object is physical reality(Occupying actual space in memory/ram)
    // classes helps us in defining user defined data type
    // an object is an instance of a class
    // all the object's of class have same property but the value of that property may be different
    // 'new' keyword is used to create object of a class

    // create a class
    // for every single student
    class Student {
        int rno;
        String name;
        float marks;
    }

    // variable inside object is known as instance variable
}

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

//        Student kunal; // declaring reference variable (object of Student class)
//        kunal = new Student();

        Student kunal = new Student(15, "kunal Kushwaha", 85.4f);
//      constructor Student() -> a constructor basically defines what happens when your object will be created
//      constructor is special function, that runs when you create an object and it allocates some variable(bind the arguments with the object)

//        kunal.rno = 13;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 88.5f;

        Student rahul = new Student();

//        kunal.changeName("Shoe lover");
//        rahul.changeName("shubham kumar");
//        kunal.greeting();
//        rahul.greeting();

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        System.out.println(Arrays.toString(students));

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something";
        System.out.println(two.name);

        Student student1 = new Student(); // Student class here instantiated
        // LHS: happens(Stack memory allocated) at compile time, RHS: happens(Heap memory allocated) at runtime (DMA)
    }

    // class is like a logical construct or template(written RULE) & object is physical reality(Occupying actual space in memory/ram)
    // classes helps us in defining user defined data type
    // an object is an instance of a class
    // all the object's of class have same property but the value of that property may be different
    // 'new' keyword is used to create object of a class


    // variable inside object is known as instance variable

    // new keyword dynamically allots --> allocates the memory at runtime(DMA) and returns a reference to it
    // hence all class objects in java must be allocated dynamically
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 91.4f;

    // we need a way to add values of the above properties object by object
    // we need one word to access every object

//    Student () {
//        this.rno = 13;
//        this.name = "kunal Kushwaha";
//        this.marks = 88.5f;
//    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }

    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this keyword will replace with arpit
    Student (int roll, String name, float marks) {
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void changeName(String newName){
        this.name = newName;
    }

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }
}


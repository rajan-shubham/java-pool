package singleton;

import access.A;

import java.util.ArrayList;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj0 = new A(12, "someone"); // this not work as it is protected in its class and you are in different package
        SubClass obj = new SubClass(45, "Kunal Kushwaha"); // this is correct
        int n = obj.num;
        // subclass of class A but in different package, protected variable of class A is accessible here
    }
}

class SubSubClass extends SubClass{
    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(4, "rajan");
        int n = obj.num; // this way you can also access protected num. var. in class A
    }
}

class SubClass2 extends A{
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(23, "hello");
        System.out.println(obj.num);
    }
}

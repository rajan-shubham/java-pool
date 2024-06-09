package introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 20;
//        int b = 30;
//        swap(a, b); // here we are calling swap with pass by value, so swap fun. does not swap the actual a & b we have

//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;
        swap(a, b);

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;

        final A kunal = new A("shubham kumar");
        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it.
//        kunal = new A("new object");

//        Student makaut = new Student();
//        System.out.println(makaut.name);

//        A obj;
//
//        for (int i = 0; i < 100; i++) {
//            obj = new A("Random Name");
//        }

        A obj = new A("abcdefghi");
        System.out.println(obj);
    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}

// final int INCREASE = 2;
// always initialize while declaring it

class A {
    final int num = 10;

    String name;

    public A(String name) {
//        System.out.println("Object Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
//        super.toString();
        System.out.println("Object is destroyed!");
    }
}

//packges are just container/bbox for classes (a packages is just a folder);
// it use to keep the class name in compartment
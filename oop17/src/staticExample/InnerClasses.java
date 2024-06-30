package staticExample;

//class Test{
//    static String name;
//
//    public Test(String name) {
//        Test.name = name;
//    }
//}

public class InnerClasses {
    static class Test{ // by putting static, now class Test is not dependent on objects of class InnerClasses
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("shubham");
        Test b = new Test("rajan");

        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

// outside any class it is not static, as the big Class (like InnerClasses) itself is not dependent on any other class

//static class A {
//
//}

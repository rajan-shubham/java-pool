package staticExample;

public class Main {
    public static void main(String[] args) {
        // if the file is present in same folder/package you don't have to put the import statement
        Human kunal = new Human("Kunal", false, 10000, 22);
        Human shubham = new Human("Shubham", true, 15000, 19);
        Human aman = new Human("aman", true, 15000, 19);

        System.out.println(kunal.population); // don't access static variable using object names
        System.out.println(shubham.population); // use the class name instead to access static variable
        System.out.println(Human.population); // static variable is also accessed without declaring single object of that class

        // static variable are not dependent on objects
        // static means that you can use public static void main function, without creating an object of that class
        // static method/variables they are actually belongs to the class not to the object

        Main funn = new Main();
        funn.fun2();
        fun();// not need an object, as it is static
    }

    // this is not dependent on objects
    static void fun() {
        // greeting(); // you cannot use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non-static stuff without referencing their instances in
        // a static context

        // hence here i'm referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2 () {
        greeting();
    }

    // static method can only access static data, cannot access non-static data
    //      because we know that a non-static data/method/variable is belongs to objects not to class
    // so without specifying which objects greeting() belongs to we cannot use it
    void greeting() {
//        fun();
        System.out.println("Hello World");
    }
}

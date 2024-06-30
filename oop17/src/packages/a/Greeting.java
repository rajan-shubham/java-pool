package packages.a;

import static packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
//        so packages are just container/box for classes,
//        it store the class names in compartment, in simple term packages in just a folder
        System.out.println("Hello World!");
        message();
    }
}

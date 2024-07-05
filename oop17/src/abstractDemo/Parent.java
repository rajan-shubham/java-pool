package abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 3543535;
    }

    static void hello(){
        System.out.println("Hello from Parent");
    }

    void normal(){
        System.out.println("This is Normal Method form Parent Class");
    }

//    abstract Parent(); // abstract constructors are not allowed

    abstract void career();
    abstract void partner();
}

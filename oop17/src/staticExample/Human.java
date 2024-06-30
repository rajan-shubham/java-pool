package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    // static means property that is fix for all the objects
    // some property that is not related to objected, but are common to all objects of the class
    // when a member declared as static it can be accessed before any of the object of the class is being created
    //      and without referencing to that object

    static void message(){
        System.out.println("This is message");
//        System.out.println(this.age); // you are in static, static doesn't dependent on any object, then how can you use something i.e. dependent on object
    }

    public Human(String name, boolean married, int salary, int age) {
        this.name = name;
        this.married = married;
        this.salary = salary;
        this.age = age;
        Human.population += 1;
    }
}

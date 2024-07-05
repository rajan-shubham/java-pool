package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        son.career();son.partner();

        Parent daughter = new Daughter(20);
        daughter.career();daughter.partner();

        Parent.hello();

        son.normal();

//        Parent mon = new Parent(40); // 'Parent' is abstract; cannot be instantiated
        // you cannot create object of abstract classes

        // motive of creating abstract method --> overriding it later
        // static method cannot be overridden (so abstract static method cannot created)
    }
}

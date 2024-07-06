package interfaces.extendDemo2;

public interface A {
    // static interface method should always have a body
    // call via the interface name
    static void greeting(){
        System.out.println("Hey I'm static method in interface A");
    }

    // this method fun() in this interface that I have not overridden in implement class Main,
    // and it is not giving me error because of the default keyword before void fun()
    default void fun() {
        System.out.println("I am in A");
    }
}

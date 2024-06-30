package singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton(); // 'Singleton()' has private access in 'singleton.Singleton'

        Singleton obj = Singleton.getInstance("june");

        Singleton obj2 = Singleton.getInstance("july");

        Singleton obj3 = Singleton.getInstance("august");

        // all three ref variables are pointing to just one object

        System.out.println(obj3.month);
    }
}

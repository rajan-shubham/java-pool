public class Shadowing {
    static int x = 90; // this will be shadowed at line 5
    public static void main(String[] args) {
        System.out.println(x); // print 90
        int x = 40; // the class variable at line 2 is shadowed by this
        System.out.println(x); // print 40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}

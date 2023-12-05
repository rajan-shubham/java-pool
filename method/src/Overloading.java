public class Overloading {
    public static void main(String[] args) {
        //function overloading -> two or more function having same name regardless of there return type
        //                     -> overloading not take place when all with same name function having different input type
        //                     -> overloading displace by fun. having same type of arg. but different in no.
        fun(67);
        fun("shubham");
        int ans = sum(4, 5 ,9);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}

public class Swap2Num {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        swap(a, b);
    }

    static void swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
    }
}

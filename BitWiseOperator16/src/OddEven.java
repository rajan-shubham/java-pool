public class OddEven {
    public static void main(String[] args) {
        System.out.println(evenorodd(10));

        int n = 67;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    static boolean evenorodd(int num){
        if((num & 1) == 1){
            return true;
        }else {
            return false;
        }
    }
}
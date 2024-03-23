import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
//        factor1(20);
//        factor2(64);
        factors3(36);
    }

    // time : O(n)
    static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // time : O(Sqrt(n))
    static void factor2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + (n/i) + " ");
                }
            }
        }
    }

    // both time and space with be O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}

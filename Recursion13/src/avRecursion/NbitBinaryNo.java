package avRecursion;

public class NbitBinaryNo {
    public static void main(String[] args) {
        int n = 3;
        String op = "";
        int one = 0;
        int zero = 0;
        nBitBinNo(one, zero, n, op);
    }

    public static void nBitBinNo(int one, int zero, int n, String op){
        if (n == 0){
            System.out.println(op);
            return;
        }
        nBitBinNo(one+1, zero, n-1, op+"1");
        if (one > zero) nBitBinNo(one, zero+1, n-1, op+"0");
    }
}

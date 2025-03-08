public class KthSymbolinGrammer{
    public static void main(String[] args) {
        // grammer 
        // if n(row) and k(column) == 1 --> 0
        // productions 0 --> 01 and 1 --> 10

        // solution -> let 0 as false and 1 as true
        int symbol = kthSymbol(2, 3);
        System.out.println(symbol);
    }

    // finding kth symbol in grammer
    public static int kthSymbol(int n, int k){
        if(n == 1 && k == 1) return 0;

        int mid = (int)Math.pow(2, n-1)/2;

        if(k <= mid) return kthSymbol(n-1, k);
        else return 1 - kthSymbol(n-1, k-mid);
    }
}
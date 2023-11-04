import java.util.Scanner;
public class FibonacciNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0 ,b =1,sum=0,n;
        System.out.print("Enter value of n for N'th fibonacci no. : ");
        n = in.nextInt();
        for (int i =1;i<n;i++){
            sum = a + b ;
            a = b;
            b = sum;
            System.out.println(b);
        }
        System.out.println(n + "th Fibonacci no. is : " + b);

//        int count = 2;
//        while (count <= n){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//            System.out.println(b);
//        }
    }
}

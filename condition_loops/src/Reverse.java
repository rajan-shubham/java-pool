import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a No. to make it reverse : ");
        int num = in.nextInt();
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println("No. after reversing is : " + ans);
    }
}

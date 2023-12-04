import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum();
//        System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int sum = a + b;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);
    }

    /*
        access modifier (we'll look in OOP) return_type name (arguments) {
        //body
        return statement;
        }

    */
}

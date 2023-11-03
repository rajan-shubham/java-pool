import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first no. : ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second no. : ");
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("The summetion of given two no. is = " + sum);
    }
}

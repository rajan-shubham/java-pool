// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give your monthly salary : ");
            int salary = in.nextInt();
            if (salary > 10000){
                salary = salary + 2000;
            }
            else salary = salary + 1000;
            System.out.println("Your salary after bonus is : " + salary);
        }
    }
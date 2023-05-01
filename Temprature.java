import java.util.Scanner;
public class Temprature{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temprature in C : ");
        float TempC =in.nextFloat();
        float TempF =(TempC*9/5)+32;
        System.out.println("The temp in celcius is : " + TempC + " and in Ferenhite it is : " + TempF);
    }
}
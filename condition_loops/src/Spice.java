import java.util.Scanner;

public class Spice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter No. of Test Cases : ");
        int T = in.nextInt();
        for (int i=0 ; i<T ; i++ ){
            System.out.print("Give the rating of Spice b/w 1 to 10 : ");
            int X = in.nextInt();
            if(X < 4){
                System.out.println("The spice is MILD");
            }
            else if(X >= 4 && X < 7){
                System.out.println("The spice is MEDIUM");
            }
            else{
                System.out.println("The spice is HOT");
            }
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

public class DieselPetrol {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            double n = in.nextInt();
            double x = in.nextInt();
            double y = in.nextInt();
            double a = in.nextInt();
            double b = in.nextInt();
            if ((n/a)*x < (n/b)*y){
                System.out.println("PETROL");
            } else if ((n/a)*x > (n/b)*y){
                System.out.println("DIESEL");
            } else {
                System.out.println("ANY");
            }
        }
    }
    // https://www.codechef.com/problems/MILEAGE

    /*
    Mileage matters
Chef wants to rent a car to travel to his restaurant which is
N kilometers away. He can either rent a petrol car or a diesel car.
One litre of petrol costs
X rupees and one litre of diesel costs
Y rupees. Chef can travel
A kilometers with one litre of petrol and
B kilometers with one litre of diesel.
Chef can buy petrol and diesel in any amount, not necessarily integer. For example, if
X=95
X=95, Chef can buy half a litre of petrol by paying
95/2=47.5 rupees.

Which car should the chef rent in order to minimize the cost of his travel?
     */
}

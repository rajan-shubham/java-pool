public class StackSafe{
public static void main(String agrs[]){
    System.out.println(summation(10, 0));
    System.out.println(factorial(10, 1));
}

public static int summation(int num, int acc){
	return num == 0 ? acc : summation(num-1, acc+num); 
}

public static int factorial(int num, int acc){
    return num == 0 ? acc : factorial(num - 1, acc * num);
}

}
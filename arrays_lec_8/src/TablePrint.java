import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of input element: ");
        int n = in.nextInt();
        int[] table = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0; i<n; i++){
            table[i] = in.nextInt();
        }
        for(int ele : table){
            for (int i = 1; i <=10; i++) {
                System.out.print( ele * i +" " );
            }
            System.out.println();
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.codechef.com/problems/HATTRICK?tab=submissions
class HattricorNot{
	public static void main (String[] args) throws java.lang.Exception
	{
	
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
//            int n = sc.nextInt();
            int count = 0;
            boolean flag = false;
            for (int i = 0; i < 6; i++) {

                if(sc.hasNextInt()) {
                    int inp = sc.nextInt();
                    count=0;
                }
                else {
                    String inp = sc.next();
                    count++;
                }

                if(count==3) flag=true;
            }
            if(flag)
            System.out.println("YES");
            else System.out.println("NO");
        }
    }
            
            // int arr[] = new int[6];
            // int count = 0;
            // for(int i = 0; i<6; i++){
            //     arr[i] = (int) in.next().charAt(0);
            //     if(arr[i] == 87){
            //         count++;
            //     }else{
            //         count = 0;
            //     }
            //     if(count == 3){
            //         System.out.println("YES");
            //         break;
            //     }
            // }
            // System.out.println("NO");
        //  }
}

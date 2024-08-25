import java.util.*;
import java.lang.*;
import java.io.*;

public class ChildEyeColor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String eyeColors = in.nextLine();
        String[] eCArr = eyeColors.split(" ");
        char father = eCArr[0].charAt(0);
        char mother = eCArr[1].charAt(0);

        if(father == 'R' || mother == 'R'){
            System.out.println("R");
        }else if(father == 'B' || mother == 'B'){
            System.out.println("B");
        }else{
            System.out.println("G");
        }
    }

    // R B --> R
    // The two people have brown and blue eyes and brown is the most common. Therefore, their child will most likely have brown eyes.
}

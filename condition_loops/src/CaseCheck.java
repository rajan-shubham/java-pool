import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String word = "hello";
//        System.out.println(word.charAt(0));

        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }

//        System.out.println(ch);
    }
}

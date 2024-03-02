import java.util.Arrays;

public class StrMethod {
    public static void main(String[] args) {
        String name = "Shubham Rajan";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());//it will create another object
        System.out.println(name); // the original object will same

        System.out.println(name.indexOf('R'));
        System.out.println("   Kunal      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

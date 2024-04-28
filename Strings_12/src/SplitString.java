public class SplitString {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] splitStr = str.split(" "); // Splits the string by space
        for (String part : splitStr) {
            System.out.println(part);
        }
    }
}

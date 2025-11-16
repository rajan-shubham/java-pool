public class CharIntegerConversion {
    public static void main(String[] args) {
        String a = "a";
        String s1 =  "7";
        char c = a.charAt(0);
        int numericValue = c - '0';
        System.out.println("Integer value: " + numericValue + " and " + (s1.charAt(0) - '0'));


        String s = "A";
        char ch = s.charAt(0); // Get the first character 'a'
        int asciiValue = ch; // Convert 'a' to its ASCII value (97)
        System.out.println("ASCII value: " + asciiValue); // Output: 97

        asciiValue = 65; // for 'A'
        char A = (char) asciiValue;
        System.out.println(A);


        int numericValue1 = 7;
        char c1 = Character.forDigit(numericValue1, 10); // Convert 7 to '7' (base 10)
        System.out.println("Character value: " + c1); // Output: 7
    }
}

import java.util.Arrays;

public class CharIntegerConversion {
    public static void main(String[] args) {
        // converting only char of string to only string by subtracting with '0'
        // gives integer for mathematical operation
        String a = "a";
        String s1 =  "7";
        char c = a.charAt(0);
        int numericValue = c - '0';
        System.out.println("Integer value: " + numericValue + " and " + (s1.charAt(0) - '0'));


        // simple conversion of char of string to it's ascii values
        String s = "A";
        char ch = s.charAt(0); // Get the first character 'a'
        int asciiValue = ch; // Convert 'a' to its ASCII value (97)
        System.out.println("ASCII value: " + asciiValue); // Output: 97

        // converting back any integer to it's meaningful char
        asciiValue = 65; // for 'A'
        char A = (char) asciiValue;
        System.out.println(A);

// i don't know :) need more study
        int numericValue1 = 7;
        char c1 = Character.forDigit(numericValue1, 10); // Convert 7 to '7' (base 10)
        System.out.println("Character value: " + c1); // Output: 7


        // extraction integer value by subtracting by '0' to fill the alphabetArray[26]
        String str = "abcdefghijklmnopqrstuvwxyz";
        int zero = str.charAt(0) - 'a'; // giving integer 0 value
        System.out.println(zero);

        int[] charToAsciiVal = new int[26];
        for(int i = 0; i<str.length(); i++){
            charToAsciiVal[i] = str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(charToAsciiVal[i] + " ");
        }
        System.out.println();


        // converting string char to int array
        // then sort then back to string (alphabetical sorted)
        String sortString = "axplusby";
        int[] sortStrArr = new int[sortString.length()];
        for (int i = 0; i < sortString.length(); i++) {
            sortStrArr[i] = sortString.charAt(i);
        }
        Arrays.sort(sortStrArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sortString.length(); i++) {
            System.out.print(sortStrArr[i] + " ");
            sb.append((char) sortStrArr[i]);
        }
        System.out.println(sb);
    }
}

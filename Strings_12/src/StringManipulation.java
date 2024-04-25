public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String concatenated = str1 + " " + str2; // Using + operator
        System.out.println(concatenated);

        String concatenatedWithMethod = str1.concat(" ").concat(str2); // Using concat() method
        System.out.println(concatenatedWithMethod);
    }
}

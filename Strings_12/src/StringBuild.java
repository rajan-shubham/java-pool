public class StringBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<26; i++){
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.delete(5,10);
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder);
    }
}

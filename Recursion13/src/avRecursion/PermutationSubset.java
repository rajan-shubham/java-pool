package avRecursion;

public class PermutationSubset {
    public static void main(String[] args) {
        String ip = "abc";
        String op = "";
        spaceSubset(ip, op);
        System.out.println();
        caseSubset(ip, op);
    }

    public static void spaceSubset(String ip, String op){
        op = op + ip.charAt(0); // sending first char to op as it doesn't need space
        ip = ip.substring(1); // extracting first char from ip
        helper(ip, op);
    }
    private static void helper(String ip, String op){
        if (ip.isEmpty()){
            System.out.print(op + " ");
            return;
        }
        helper(ip.substring(1), op+"_"+ip.charAt(0)); // adding op + _a
        helper(ip.substring(1), op+ip.charAt(0)); // adding op + a
    }

    public static void caseSubset(String ip, String op){
        if (ip.isEmpty()){
            System.out.print(op + " ");
            return;
        }
        caseSubset(ip.substring(1), op+ip.charAt(0));
        caseSubset(ip.substring(1),op+(char)(ip.charAt(0)-32));
    }
}

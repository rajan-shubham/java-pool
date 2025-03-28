package avRecursion;

import java.util.*;

public class Subset {
    static ArrayList<String> subsets = new ArrayList<>();

    public static void main(String[] args) {
        String ip = "aab";
        String op = "";
        findSubset(ip, op);
        findSubset2(ip, op);
        findUniqueSubset(ip, op);

        System.out.println();
        System.out.println(subsets);
        System.out.println(set);
    }

    // for finding the subset recursively (selecting of not selecting for a char in input string)
    public static void findSubset(String ip, String op){
        if (ip.isEmpty()){ // when input string is empty or you are at leaf node
            System.out.print(op + " ");
            return;
        }
        findSubset(ip.substring(1), op); // decreasing ip string, not adding first char to output string
        findSubset(ip.substring(1), op + ip.charAt(0)); // decreasing ip string, add first char of ip string to op string
    }

    public static void findSubset2(String ip, String op){
        if (ip.isEmpty()){
            subsets.add(op);
            return;
        }
        char ch = ip.charAt(0);
        findSubset2(ip.substring(1), op);
        findSubset2(ip.substring(1), op + ch);
    }

    static HashSet<String> set = new HashSet<>();
    public static void findUniqueSubset(String ip, String op){
        if (ip.isEmpty()){
            set.add(op);
            return;
        }
        findUniqueSubset(ip.substring(1), op);
        findUniqueSubset(ip.substring(1), op + ip.charAt(0));
    }
}

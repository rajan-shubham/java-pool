package string;
import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        // Subsets:- Taking any no. of elements it may or may not be adjecent
        // 1> Permutation & Combinations
        // Subsets -> Non adjecent collection
        // [3,5] --> [3],[3,5],[5],[] (num. of set => 2 ^ n)
        // in this session we do our quest. by using RECURSION & ITTRATION


        subsequence("","abc");
        System.out.println(subSeqRet("", "abc"));
    }

    private static void subsequence(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
//        subsequence(p + ch, up.substring(1));
//        subsequence(p, up.substring(1));

        // if we reverse the order then the order of answer is opposite
        subsequence(p, up.substring(1));
        subsequence(p + ch, up.substring(1));

    }

     static ArrayList<String> subSeqRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}

package avRecursion;

import java.util.ArrayList;

public class GenerateBalancedParentheses {
    public static void main(String[] args) {
        ArrayList<String> bp = new ArrayList<>();
        int open = 3;
        int close = 3;
        String op = "";
        genBalParen(open, close, op, bp);
        System.out.println(bp);
    }

    public static void genBalParen(int open, int close, String op, ArrayList<String> bp){
        if (open == 0 && close == 0){
            bp.add(op);
            return;
        }
        if (open != 0) genBalParen(open -1, close, op+"(", bp);
        if (close > open) genBalParen(open, close -1, op+")", bp);
    }
}

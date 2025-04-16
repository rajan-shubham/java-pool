package avBackTrack;

import java.util.*;

public class StringPermutation{
    public static void main(String[] args) {
        // print unique permutation from a string (abc)
        // abc, acb, bac, bca, cab, cba
        // _, _, _ -> 3 * 2 * 1

        // for duplicate (aab)
        // we have 3 options 1> Normal recursion+put all into Set, 2> putting each item into Set and checking if present 3> Controled Recursion (Prunig Branches of same Ip&Op)
        // no. of permutation of aab ==> 3!/2! = 3 (ex: aabbc) ==> 5!/2!*2!

        System.out.println(findAllPermutationRec("abc"));
        System.out.println(findAllPermutationRec("aab"));

        System.out.println(findAllPermutationBT("abc"));
        System.out.println(findAllPermutationBT("aab"));
    }

    public static ArrayList<String> findAllPermutationBT(String s){
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        permuteBT(sb, 0, list);
        return list;
    }
    private static void permuteBT(StringBuilder sb, int start, ArrayList<String> list){
        if(start == sb.length()){
            list.add(sb.toString());
            return;
        }
        Set<Character> set = new HashSet<>();
        for(int i = start; i<sb.length(); i++){
            if(!set.contains(sb.charAt(i))){
                set.add(sb.charAt(i));
                swap(sb, start, i);
                permuteBT(sb, start+1, list);
                swap(sb, start, i);
            }
        }
    }
    private static void swap(StringBuilder sb, int start, int end){
        char temp = sb.charAt(start);
        sb.setCharAt(start, sb.charAt(end));
        sb.setCharAt(end, temp);
    }


    public static ArrayList<String> findAllPermutationRec(String ip){
        ArrayList<String> list = new ArrayList<>();
        permuteRec(ip, "", list);
        return list;
    }
    private static void permuteRec(String ip, String op, ArrayList<String> list){
        if(ip.isEmpty()){
            list.add(op);
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < ip.length(); i++) {
            if(!set.contains(ip.charAt(i))){
                set.add(ip.charAt(i));
                permuteRec(ip.substring(0, i)+ip.substring(i+1), op+ip.charAt(i), list);
            }
        }
    }
}

package avBackTrack;

import java.util.ArrayList;
//https://www.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1
public class NIncDigitNum {
    public static void main(String[] args) {
        System.out.println(n_digit_inc_num(2));
    }

    public static ArrayList<Integer> n_digit_inc_num(int n){
        ArrayList<Integer> numbers = new ArrayList<>();
        if(n == 1){
            for (int i = 0; i <= 9; i++) numbers.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        findIncDigitNum(n, list, numbers);
        return numbers;
    }
    private static void findIncDigitNum(int n, ArrayList<Integer> list, ArrayList<Integer> numbers){
        if (n == 0){
            int ans = 0;
            for (Integer integer : list) ans = ans * 10 + integer;
            numbers.add(ans);
            return;
        }
        for(int i = 1; i<=9; i++){
            if (list.isEmpty() || i > list.get(list.size() -1)){
                list.add(i);
                findIncDigitNum(n-1, list, numbers);
                list.removeLast();
            }
        }
    }
}

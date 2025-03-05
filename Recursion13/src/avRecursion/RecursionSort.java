
import java.util.ArrayList;

public class RecursionSort{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);
        recSort(list);
        System.err.println(list);
    }

    public static void recSort(ArrayList<Integer> list){
        if(list.size() == 1) return;

        int temp = list.removeLast();

        recSort(list);

        insert(list, temp);
    }

    public static void insert(ArrayList<Integer> list, int temp){
        if(list.isEmpty() || list.get(list.size() - 1) <= temp){
            list.addLast(temp);
            return;
        }
        int val = list.removeLast();

        insert(list, temp);

        list.addLast(val);
    }
}
package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(0, 1);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(6);
        newList.add(7);
        list.addAll(newList);
        System.out.println(list);
        System.out.println(list.get(5));*/

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.reversed();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("iterator " + it.next());
        }

        /*list.set(0, 2999);
        System.out.println(list);
        System.out.println(list.contains(50));*/

        /*System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(50));
        System.out.println(list);*/
    }
}

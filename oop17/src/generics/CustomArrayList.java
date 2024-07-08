package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        
        // copy the current items in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int remove = data[--size];
        return remove;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
        // this some methods that java list provides us
//        list.add(45);list.remove(0);list.get(0);list.set(1, 6789);list.size();list.isEmpty();

        CustomArrayList list = new CustomArrayList();
//        list.add(7);
//        list.add(9);
//        list.add(11);
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }

        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("69hello"); // generic --> parametrized data type
    }
}

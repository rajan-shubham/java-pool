package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];
        
        // copy the current items in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T remove = (T) (data[--size]);
        return remove;
    }

    public T get(int index){
        return (T) (data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
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

        CustomGenericArrayList list = new CustomGenericArrayList();
//        list.add(7);
//        list.add(9);
//        list.add(11);

//        for (int i = 0; i < 14; i++) {
//            list.add(2*i);
//        }

//        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("69hello"); // generic --> parametrized data type

        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);
    }
}

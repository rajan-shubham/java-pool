package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
//        list.forEach((item) -> System.out.println(item*2));

        // lambda expression in short (you can assign expression to variable fun that are of type interfaces)
        Consumer<Integer> fun = (item) -> System.out.println(item * 2); // Consumer<T> in of type interface
        list.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;
    }

    int sum(int a, int b){
        return a + b;
    }
}

interface Operation {
    int operation (int a, int b);
}
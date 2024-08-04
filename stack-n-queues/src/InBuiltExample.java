import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop()); // gives underflow exception

        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(3);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}

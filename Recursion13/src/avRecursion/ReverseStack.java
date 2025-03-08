import java.util.Stack;

public class ReverseStack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack); // [1, 2, 3, 4, 5]
        reverseStack(stack);
        System.out.println(stack); // [5, 4, 3, 2, 1]
    }

    // function to reverse a stack
    public static void reverseStack(Stack<Integer> stack){
        if(stack.size() == 1) return;

        int top = stack.pop();
        reverseStack(stack);  
        insertAtLast(stack, top);      
    }
    private static void insertAtLast(Stack<Integer> stack, int top){
        if(stack.isEmpty()) {stack.push(top); return;}

        int temp = stack.pop();
        insertAtLast(stack, top);
        stack.push(temp);
    }
}
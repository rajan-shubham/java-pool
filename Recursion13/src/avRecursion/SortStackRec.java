import java.util.Stack;
public class SortStackRec{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(0);
        stack.push(2);
        stack.push(8);
        stack.push(9);

        System.out.println(stack); // before sorting the stack
        sortStack(stack); // recursion sort
        System.err.println(stack); // after sorting the stack
        // System.err.println(stack.pop() + " " + stack.pop()+  " " + stack.pop() + " " + stack.pop());
        System.err.println(stackMiddleElement(stack));
        System.err.println(stack);
    }

    // sorting a stack (max at top and min at bottom)
    public static void sortStack(Stack<Integer> stack){
        if(stack.size() == 1) return;

        int temp = stack.pop();

        sortStack(stack);

        insert(stack, temp);
    }   
    public static void insert(Stack<Integer> stack, int temp){
        if(stack.isEmpty() || stack.peek() <= temp){
            stack.push(temp);
            return;
        }

        int val = stack.pop();

        insert(stack, temp);

        stack.push(val);
    }

    // give the removed middle element from stack
    public static int stackMiddleElement(Stack<Integer> stack){
        return recStackMiddle(stack, stack.size()/2 + 1);
    }
    static int recStackMiddle(Stack<Integer> stack, int index){
        if(index == stack.size()) return stack.pop();
        int top = stack.pop();
        int middle = recStackMiddle(stack, index);
        stack.push(top);
        return middle;
    }
}
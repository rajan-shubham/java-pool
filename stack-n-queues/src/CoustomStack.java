public class CoustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public CoustomStack() {
//        this.data = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public CoustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack Overflow");
            return false;
        }

        top++;
        data[top] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Stack Underflow");
        }
//        int poppedElem = data[top];
//        top--;
//        return poppedElem;
        return data[top--];
    }

    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[top];
    }

    private boolean isFull() {
        return top == data.length - 1; // ptr is at last index
    }

    private boolean isEmpty() {
        return top == -1; // top is at -1 index
    }
}

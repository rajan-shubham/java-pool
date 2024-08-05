public class CoustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CoustomStack() {
//        this.data = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public CoustomStack(int size) {
        this.data = new int[size];
    }
}

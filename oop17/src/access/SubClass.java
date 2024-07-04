package access;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(4, "rajan");
        int n = obj.num;

        System.out.println(obj instanceof A); // true for instanceof A , SubClass, Object
    }
}

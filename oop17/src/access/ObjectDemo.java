package access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // these 2 already covered
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // we will go in detail of how to create it in HashMap lecture
    @Override
    public int hashCode() {// it basically gives a number representation of an object
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(45, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(45, 78.9f);

        if (obj == obj2){
            System.out.println("obj is equal to obj2");
        }

        if (obj.equals(obj2)){ // actually checking the content of object (String lecture)
            System.out.println("Obj is equal to Obj2");
        }

        System.out.println(obj.getClass()); // getClass information is stored in heap

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }
}

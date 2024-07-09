package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34, "kunal kushwaha");
//        Human twin = new Human(kunal);

        // Above the problem is that we are taking a lot of processing time (as we create objects by using "new" keyword)
        // clone is actually a method in the object class that can be used to make these copies

        // in java.lang package there an interface called cloneable

        Human twin = (Human) kunal.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));
    }
}

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = b;
//        b = a;
//        a = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Shubham Kumar";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam){

        naam = "Rahul Rana"; // not changing , creating a new object
    }

    static void swap(int a, int b){
        int temp = b;
        b = a;
        a = temp;
        // this change will only be valid in this function scope only.
    }
}
// for primitive datatypes it's olny going to do is pass by value, & for object & refrences (for complex data types)
// -> pass by value of that reference variable
// -> so both the refernce variable pointing to the same object
// -> if you make a change via one reference variable -> original one will be change
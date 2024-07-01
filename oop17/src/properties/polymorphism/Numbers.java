package properties.polymorphism;
// Compile time/Static polymorphism
public class Numbers {

    double sum(double a, int b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(2, 3);
        obj.sum(1, 3, 7);

//        obj.sum(4, 5, 6, 8); // there not a function sum in Numbers class that takes 4 arguments
    }
}
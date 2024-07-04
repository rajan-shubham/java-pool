package singleton;

import access.A;

public class NotSubClass{


    public static void main(String[] args) {
        NotSubClass obj = new NotSubClass();
//        int n = obj.num; // protected variable in class A not access here
        // in class of diff. package and not a subClass of access.A, protected variable is not be used
    }
}

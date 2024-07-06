package interfaces.nested;

import javax.swing.*;

public class A {
    // nested interface can be declared as public, private or protected,
    // but the top level interface has to be declared as public or the default one
    //   that's the difference, all the standard applies the same
    // nested interface
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
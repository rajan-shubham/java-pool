package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.5, 5.5, 6.5);
        System.out.println(box1.getL());
//        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//        System.out.println(box3.h + " " + box3.weight);

        // Weired example
        // box5: this is of reference type of Box, and it is referencing to an object of type BoxWeight
        // it is reference type (super class) who determine what members can be accessed not the sub class
//        Box box5 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box6 = new Box(2,3,4);
        //        System.out.println(box6);


//        BoxPrice box = new BoxPrice();
//        BoxPrice box = new BoxPrice(5, 8, 200);

//        Box.greeting();

        Box box = new BoxWeight();
        box.greeting(); // you can inherit, but you can't override
    }
}

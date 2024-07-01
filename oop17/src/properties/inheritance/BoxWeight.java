package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight () {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        super(other);// exactly like this it is sending to its parent (Box box5 = new BoxWeight(2, 3, 4, 8);)
        this.weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// call the parent class constructor
        // used to initialize values present in parent class,
        //  but a child can't access private property of its parent class

//        System.out.println(super.weight);

        this.weight = weight;
    }
}

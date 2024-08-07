package NandhuDSA.oops.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // this super keyword call the parent class constructor
        this.weight = weight;
    }
}

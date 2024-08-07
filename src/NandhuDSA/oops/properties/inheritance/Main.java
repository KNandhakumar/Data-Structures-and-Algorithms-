package NandhuDSA.oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        // no argument
        /* Box box = new Box();
        System.out.println(box.l + " " + box.h + " " + box.w); /*

        // creating another object for side parameter
        /* Box boxSide = new Box(4);
        System.out.println(boxSide.l + " " + boxSide.h + " " + boxSide.w); */

        // creating another object for 3 parameters
        /* Box boxThree = new Box(10.0,4,10);
        System.out.println(boxThree.l + " " + boxThree.h + " " + boxThree.w); */


        // creating another object for Box parameter
        /* Box box2 = new Box(box);
        System.out.println(box2.l + " " + box2.h + " " + box2.w); */

        // Box weight object
        BoxWeight weightBox = new BoxWeight();
        System.out.println(weightBox.h + " " + weightBox.weight);

        BoxWeight weightBox1 = new BoxWeight(1,2,3,4);
        System.out.println(weightBox1.l + " " + weightBox1.h + " " + weightBox1.w + " " + weightBox1.weight);
    }
}

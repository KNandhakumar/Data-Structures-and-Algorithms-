package NandhuDSA.oops.properties.inheritance.MultiLevelinheritance;

public class MultiInheritance {
    public static void main(String[] args) {
        // dog inherit animals class , then puppy inherit dog class so puppy access all class properties
        // now creating puppy class object then access all proprieties

        Puppy puppy = new Puppy();
        puppy.Bark();

        // now creating dog object this object not access puppy properties
        Dog beagle = new Dog();
        beagle.eat();
    }
}

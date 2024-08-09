package NandhuDSA.oops.properties.inheritance.inheritanceExample;

public class MainClass {
    public static void main(String[] args) {
        // now creating son class object then access the dad class values for son object because son class extends or inherit dad class
        Son s1 = new Son();
        System.out.println(s1.money);
        System.out.println(s1.car);
        System.out.println(s1.house);
    }
}

package NandhuDSA.oops.This;

public class ThisKeywordExample {
    public static void main(String[] args) {
        // creating object for teacher class
        Teacher t1 = new Teacher();

        // default myName variable value is null
        System.out.println(t1.myName);

        // using this keyword in Teacher class this represent t1
        t1.setName("vishnu");
        System.out.println(t1.myName);
    }
}
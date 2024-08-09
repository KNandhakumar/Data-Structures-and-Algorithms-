package NandhuDSA.oops.properties.inheritance.MultiLevelinheritance;

// dog extends or inherit animals class then puppy access dog class so puppy access dog properties and animals properties this is multi level inheritance
public class Dog extends Animals{
    String bark = "barking";
    void Bark(){
        System.out.println("Dog is" + " " + bark);
    }
}

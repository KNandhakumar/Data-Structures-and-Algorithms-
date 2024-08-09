package NandhuDSA.oops.This;

public class Teacher {
    String myName;

    Teacher(){
        System.out.println("hello");
    }

    // this keyword refers to the current object in a method or constructor
    // the most common use of this keyword is to eliminate the confusion between class attributes and parameters with the same name
    void setName(String myName){
        this.myName = myName;
    }
}

package NandhuDSA.oops.staticExample;

public class Human {
    public int age;
    public String name;
    public int salary;
    public boolean married;
    public static int population; // this static use for this variable is common for this class

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population +=1; // population = population++;
    }
}

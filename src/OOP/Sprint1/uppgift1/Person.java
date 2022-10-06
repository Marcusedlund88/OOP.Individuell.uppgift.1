package OOP.uppgift1;

public class Person {
    protected String name;
    protected String address;
    protected int age;
    public Person(){}
    public Person(String name, String address, int age){

        this.name = name;
        this.address = address;
        this.age = age;

    }
public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }

}

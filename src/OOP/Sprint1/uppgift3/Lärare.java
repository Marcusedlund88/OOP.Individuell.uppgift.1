package OOP.Sprint1.uppgift3;
public class Lärare extends Person{

    private int age;
    private String name;

    Lärare(int age, String name){
        super(age, name);
        this.name = name;
        this.age = age;
    }
}
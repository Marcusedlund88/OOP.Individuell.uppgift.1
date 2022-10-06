package OOP.Sprint1.uppgift3;
public class Elev extends Person{

    private int age;
    private String name;

    Elev(int age, String name){
        super(age, name);
        this.name = name;
        this.age = age;
    }
    @Override
    public int getAge() {

        return age;
    }
    @Override
    public String getName() {

        return name;
    }
}
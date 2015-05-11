package lesson05.Task8_package;

public class HR extends Person {

    public HR(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name + " is HR Manager";
    }
}

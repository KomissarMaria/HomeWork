package lesson05.Delete_from_TaskList.Task11_package;

public class Circle extends Figure{
    private int rad;

    public Circle(int rad){
        this.rad = rad;
        this.name = "Круг";
    }

    @Override
    public double findsquare(){
        square = Math.pow(rad,2)* Math.PI;
        return square;
    }

    @Override
    public void print(){
    }

    public double sumside(){
        return 2 * Math.PI *rad;
    }
}

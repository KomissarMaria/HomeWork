package lesson05.Task7_package;

public class JavaJuniorDeveloper extends JuniorDeveloper {
    protected String lang;

    public JavaJuniorDeveloper(String name, int basicSalary, int experience, String lang) {
        super(name, basicSalary, experience);
        this.lang = lang;
    }

    @Override
    public double getSalary() {
        return (basicSalary * 3) + (experience > 0 ? basicSalary * experience * 0.3 : 0);
    }

}

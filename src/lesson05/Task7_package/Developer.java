package lesson05.Task7_package;

public abstract class Developer {

	protected String name;
	protected double basicSalary;
	protected int experience;
	
	public Developer(String name, double basicSalary, int experience) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.experience = experience;
	}

    public Developer(){}
	
	public String getName() {
		return name;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public abstract double getSalary();
}

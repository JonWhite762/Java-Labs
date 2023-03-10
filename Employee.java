class Employee {
	private String name;
	private double int salary;
	private int id;
	
	public Employee(String name, double int salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	public void works(){
	System.out.println("Hard at work");
	}
	public String toString(){
		return "Name: "+ name +"Base Salary: " + salary + "ID: "+ id;
	}
}		
	
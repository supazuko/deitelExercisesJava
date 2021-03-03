public class Employee {

		private String firstName;
		private String lastName;
		private double salary;
		public double increaseSalary;
	public static void main(String[] args) {
	}
	public Employee (String firstName, String lastName, double salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public void setFirstName(String firstName){
        	this.firstName = firstName;
    	}
	public String getFirstName(){
		return firstName;
	}
	public void setlastName(String lastName){
        	this.lastName = lastName;
    	}
	public String getlastName(){
		return lastName;
	}
	public void salary(double salary){
		if (salary > 0.00){
		this.salary = salary;
		}
	}
	public double getSalary(){
		return salary;
	}
	public void increaseSalary(double increase){
		salary += increase / 100.0 * salary;
		}
}
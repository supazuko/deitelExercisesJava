public class EmployeeTest{
	public static void main(String[] args) {
	Employee firstStaff = new Employee("Doctor", "Joy", 200);
	Employee secondStaff = new Employee("Bessie", "Shittu", 100);

	
	firstStaff.salary(200);
	System.out.println(firstStaff.getSalary() * 12);

	secondStaff.salary(100);
	System.out.println(secondStaff.getSalary() * 12);

	firstStaff.salary(200 * 12);
	firstStaff.increaseSalary(10); 
	System.out.println(firstStaff.getSalary());

	secondStaff.salary(100 * 12);
	secondStaff.increaseSalary(10);
	System.out.println(secondStaff.getSalary());
}
}
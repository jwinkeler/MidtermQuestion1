
public class Employee extends Person {

	private String office;
	private String salary;
	private String dateHired;
	
	public Employee(String name,String address, String phoneNumber, String emailAddress, String office, String salary, String dateHired){
		super(name, address, phoneNumber, emailAddress);
		this.office=office;
		this.salary = salary;
		this.dateHired = dateHired;
		
	}
	@Override
	public String toString(){
		return("This is the Employee Class. The name of the person is:" + super.getName());
	}
}

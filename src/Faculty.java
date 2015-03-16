
public class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	public Faculty(String name,String address, String phoneNumber, String emailAddress, String office, String salary, String dateHired,String officeHours,String rank){
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.officeHours=officeHours;
		this.rank = rank;
		
	}
	@Override
	public String toString(){
		return("This is the Faculty Class. The name of the person is:" + super.getName());
	}
}

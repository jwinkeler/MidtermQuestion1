
public class Staff extends Employee {
	private String title;
	
	public Staff(String name,String address, String phoneNumber, String emailAddress, String office, String salary, String dateHired,String title){
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.title=title;
		
	}
	@Override
	public String toString(){
		return("This is the Staff Class. The name of the person is:" + super.getName());
	}
}

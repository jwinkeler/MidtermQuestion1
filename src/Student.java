
public class Student extends Person {
	private String classStatus;
	
	public Student(String name,String address, String phoneNumber, String emailAddress, String classStatus){
		super(name, address, phoneNumber, emailAddress);
		this.classStatus=classStatus;
		
	}
	@Override
	public String toString(){
		return("This is the Student Class. The name of the person is:" + super.getName());
	}
}


public class Student extends Person {

	private int rollNo;
	
	public Student() {
		
	}

	public Student(int rollNo, String firstName, String lastName) {
		super(firstName, lastName);
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	

}

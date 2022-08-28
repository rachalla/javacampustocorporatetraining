
public class Employee extends Person {

	private int empNo;

	public Employee() {
		super();
	}

	public Employee(int empNo) {
		super();
		this.empNo = empNo;
	}

	public Employee(int empNo, String firstName, String lastName) {
		super(firstName, lastName);
		this.empNo = empNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	
}

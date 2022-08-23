
public class Student {

	private int rollNo;
	private String name;
	
	private static int objCount;
	
	public static int getObjectCount() {
		return objCount;
	}
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		
		objCount++;
	}
	
	public Student() {
		objCount++;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

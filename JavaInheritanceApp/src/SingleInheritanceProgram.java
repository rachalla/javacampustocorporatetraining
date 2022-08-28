
public class SingleInheritanceProgram {

	public static void main(String[] args) {
		Student student = new Student(1,"Rama", "Achalla");
		System.out.println("Roll No - " + student.getRollNo());
		System.out.println("Name - " + student.getFirstName() 
					+ " " + student.getLastName());
	}

}

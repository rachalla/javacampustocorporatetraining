
public class PrototypeProgram {

	public static void main(String[] args) {
		
		
		try {
			Student student = new Student(1,"Rama");
			Student student1 = (Student) student.clone();
			System.out.println(student1.getRollNo() + "\t" + student1.getName());
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
	}

}

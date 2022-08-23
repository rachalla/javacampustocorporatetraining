
public class Program {

	public static void main(String[] args) {
		
		System.out.println(Student.getObjectCount());
		
		Student s1 = new Student(1,"rama");
		Student s2 = new Student(1,"rama");
		Student s3 = new Student(1,"rama");
			
		System.out.println(Student.getObjectCount());
		Student s4 = new Student(1,"rama");
		Student s5 = new Student(1,"rama");
		Student s6 = new Student(1,"rama");
		System.out.println(Student.getObjectCount());
		Student s7 = new Student(1,"rama");
		Student s8 = new Student(1,"rama");
		System.out.println(Student.getObjectCount());
	}
}

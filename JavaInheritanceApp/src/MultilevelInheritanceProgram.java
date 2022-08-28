
public class MultilevelInheritanceProgram {

	public static void main(String[] args) {
		
		Manager manager = new Manager(1001, "Surya", "Kumar",
				10,"ABC Project");
		System.out.println(manager.getEmpNo());
		System.out.println(manager.getFirstName());
		System.out.println(manager.getLastName());
		System.out.println(manager.getMgrId());
		System.out.println(manager.getProjectName());
		
	}

}

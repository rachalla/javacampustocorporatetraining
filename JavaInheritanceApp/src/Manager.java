
public class Manager extends Employee {
	private int mgrId;
	private String projectName;
	public Manager() {
		super();
	}
	public Manager(int empNo, String firstName, 
			String lastName, int mgrId, String projectName) {
		super(empNo, firstName, lastName);
		this.mgrId = mgrId;
		this.projectName = projectName;
	}
	public Manager(int mgrId, String projectName) {
		super();
		this.mgrId = mgrId;
		this.projectName = projectName;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
}

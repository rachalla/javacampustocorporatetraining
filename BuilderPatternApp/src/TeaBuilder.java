
public class TeaBuilder extends BeverageBuilder {

	private Tea tea = new Tea();
	
	public void addTeaPowder(TeaPowder teaPowder) {
		tea.setTeaPowder(teaPowder);
		System.out.println("Adding tea powder");
	}
}

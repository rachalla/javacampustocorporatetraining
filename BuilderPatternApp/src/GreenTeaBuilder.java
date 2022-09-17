

public class GreenTeaBuilder extends BeverageBuilder {
	private GreenTea greenTea = new GreenTea();
	
	public void addGreenTeaPowder(GreenTeaPowder greenTeaPowder) {
		greenTea.setGreenTeaPowder(greenTeaPowder);
		System.out.println("Adding green tea powder");
	}
}

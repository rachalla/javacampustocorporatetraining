
public abstract class BeverageBuilder {

	private Milk milk;
	private Sugar sugar;
	private Water water;
	
	public void addMilk(Milk milk) {
		this.milk = milk;
		System.out.println("Adding milk....");
	}
	public void addSugar(Sugar sugar) {
		this.sugar = sugar;
		System.out.println("Adding sugar....");
	}
	public void addWater(Water water) {
		this.water = water;
		System.out.println("Adding water....");
	}
	public void heat() {
		System.out.println("heating ...");
	}
	public void pour() {
		System.out.println("pouring ...");
	}
}

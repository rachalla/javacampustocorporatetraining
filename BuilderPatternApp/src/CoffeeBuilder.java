
public class CoffeeBuilder extends BeverageBuilder {
	private Coffee coffee = new Coffee();
	
	public void addCoffeePowder(CoffeePowder coffeePowder) {
		coffee.setCoffeePowder(coffeePowder);
		System.out.println("Adding coffee powder");
	}
}

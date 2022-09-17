
public class VendingMachine {
	private CoffeeBuilder coffeeBuilder;
	private TeaBuilder teaBuilder;
	private EspressoBuilder espressoBuilder;
	private GreenTeaBuilder greenTeaBuilder;
	private CapachinoBuilder capachinoBuilder;
	
	private Milk milk = new Milk();
	private Sugar sugar = new Sugar();
	private Water water = new Water();
	private CoffeePowder coffeePowder = new CoffeePowder();
	private EspressoPowder espressoPowder = new EspressoPowder();
	private TeaPowder teaPowder = new TeaPowder();
	private CapachinoPowder capachinoPowder = new CapachinoPowder();
	private GreenTeaPowder greenTeaPowder = new GreenTeaPowder();
	
	public void prepare(BeverageChoice beverageChoice) {
		switch(beverageChoice) {
		case COFFEE: 
				coffeeBuilder = new CoffeeBuilder();
				coffeeBuilder.addCoffeePowder(coffeePowder);
				coffeeBuilder.addMilk(milk);
				coffeeBuilder.addSugar(sugar);
				coffeeBuilder.addWater(water);
				coffeeBuilder.heat();
				coffeeBuilder.pour();
				break;
		case TEA:
				teaBuilder = new TeaBuilder();
				teaBuilder.addMilk(milk);
				teaBuilder.addTeaPowder(teaPowder);
				teaBuilder.addSugar(sugar);
				teaBuilder.addWater(water);
				teaBuilder.heat();
				teaBuilder.pour();
				break;
		case ESPRESSO:
				espressoBuilder = new EspressoBuilder();
				espressoBuilder.addEspressoPowder(espressoPowder);
				espressoBuilder.addMilk(milk);
				espressoBuilder.addSugar(sugar);
				espressoBuilder.addWater(water);
				espressoBuilder.heat();
				espressoBuilder.pour();
				break;
		case GREENTEA:
				greenTeaBuilder = new GreenTeaBuilder();
				greenTeaBuilder.addGreenTeaPowder(greenTeaPowder);
				greenTeaBuilder.addWater(water);
				greenTeaBuilder.heat();
				greenTeaBuilder.pour();
				break;
		case CAPACHINO:
				capachinoBuilder = new CapachinoBuilder();
				capachinoBuilder.addCapachinoPowder(capachinoPowder);
				capachinoBuilder.addMilk(milk);
				capachinoBuilder.addSugar(sugar);
				capachinoBuilder.addWater(water);
				capachinoBuilder.heat();
				capachinoBuilder.pour();
				
		}
	}
}

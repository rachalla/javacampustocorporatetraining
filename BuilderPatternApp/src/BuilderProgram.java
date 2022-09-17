
public class BuilderProgram {
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.prepare(BeverageChoice.COFFEE);
		vendingMachine.prepare(BeverageChoice.TEA);
		vendingMachine.prepare(BeverageChoice.ESPRESSO);
		vendingMachine.prepare(BeverageChoice.GREENTEA);
		vendingMachine.prepare(BeverageChoice.CAPACHINO);
		
		
	}
}

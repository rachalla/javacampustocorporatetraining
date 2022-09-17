
public class CapachinoBuilder extends BeverageBuilder {
	private Capachino capachino = new Capachino();
	
	public void addCapachinoPowder(CapachinoPowder capachinoPowder) {
		capachino.setCapachinoPowder(capachinoPowder);
		System.out.println("adding capachino powder");
	}
}

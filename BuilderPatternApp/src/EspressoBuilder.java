

public class EspressoBuilder extends BeverageBuilder {
	private Espresso espresso = new Espresso();
	
	public void addEspressoPowder(EspressoPowder espressoPowder) {
		espresso.setEsspressPowder(espressoPowder);
		System.out.println("Adding espresso powder");
	}
}

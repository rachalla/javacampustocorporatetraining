// 2. Design a "wrapper" class that can "impedance match" the old to the new
public class SquarePegAdapter {

	// 3. The adapter/wrapper class "has a" instance of the legacy class
	private SquarePeg sp;

	public SquarePegAdapter(double w) {
		sp = new SquarePeg(w);
	}

	// 1. Identify the desired interface
	public void makeFit(RoundHole rh) {
		// 4. The adapter/wrapper class delegates to the legacy object
		double amount = sp.getWidth() - rh.getRadius() * Math.sqrt(2);
		System.out.println("reducing SquarePeg " + sp.getWidth() + " by " + ((amount < 0) ? 0 : amount) + " amount");
		if (amount > 0) {
			sp.setWidth(sp.getWidth() - amount);
			System.out.println("   width is now " + sp.getWidth());
		}
	}
}

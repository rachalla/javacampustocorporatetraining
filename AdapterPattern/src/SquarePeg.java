// Purpose.  Adapter design pattern

// 1. Identify the desired interface
// 2. Design a "wrapper" class that can "impedance match" the old to the new
// 3. The adapter/wrapper class "has a" instance of the legacy class
// 4. The adapter/wrapper class "maps" (or delegates) to the legacy object
// 5. The client uses (is coupled to) the new interface

public class SquarePeg {			/*** The OLD ***/

	private double width;

	public SquarePeg(double w) {
		width = w;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double w) {
		width = w;
	}
}


public class AdapterDemoSquarePeg {
	public static void main(String[] args) {
		RoundHole rh = new RoundHole(5);
		SquarePegAdapter spa;

		for (int i = 6; i < 10; i++) {
			spa = new SquarePegAdapter((double) i);
			// 5. The client uses (is coupled to) the new interface
			spa.makeFit(rh);
		}
	}
}

// RoundHole: max SquarePeg is 7.0710678118654755
// reducing SquarePeg 6.0 by 0.0 amount
// reducing SquarePeg 7.0 by 0.0 amount
// reducing SquarePeg 8.0 by 0.92893218813452455 amount
//    width is now 7.0710678118654755
// reducing SquarePeg 9.0 by 1.9289321881345245 amount
//    width is now 7.0710678118654755

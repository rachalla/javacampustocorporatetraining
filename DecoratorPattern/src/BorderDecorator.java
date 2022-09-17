
class BorderDecorator extends Decorator { // 6. Optional embellishment
	public BorderDecorator(Widget w) {
		super(w);
	}

	public void draw() {
		super.draw(); // 7. Delegate to base class
		System.out.println("   BorderDecorator"); // and add extra stuff
	}
}

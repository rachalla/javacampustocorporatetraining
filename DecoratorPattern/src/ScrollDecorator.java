
class ScrollDecorator extends Decorator { // 6. Optional embellishment
	public ScrollDecorator(Widget w) {
		super(w);
	}

	public void draw() {
		super.draw(); // 7. Delegate to base class
		System.out.println("   ScrollDecorator"); // and add extra stuff
	}
}
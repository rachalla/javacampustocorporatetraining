
public abstract class Decorator implements Widget { // with "isa" relationship
	private Widget wid; // 4. "hasa" relationship

	public Decorator(Widget w) {
		wid = w;
	}

	public void draw() {
		wid.draw();
	} // 5. Delegation
}
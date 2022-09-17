
public class MotifFactory implements Factory {

	@Override
	public Button createButton() {
		return new MotifButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

}

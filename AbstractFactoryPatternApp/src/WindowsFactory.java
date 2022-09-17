
public class WindowsFactory implements Factory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new WindowsScrollBar();
	}

}

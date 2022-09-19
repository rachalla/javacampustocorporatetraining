
public class AbstractFactoryProgram {

	public static void main(String[] args) {
		
		Factory factory = new WindowsFactory();
		Button button = factory.createButton();
		ScrollBar scrollBar = factory.createScrollBar();
		button.draw();
		scrollBar.scroll();
		scrollBar.scroll();
		
		factory = new MotifFactory();
		button = factory.createButton();
		scrollBar = factory.createScrollBar();
		
		button.draw();
		scrollBar.scroll();

	}

}

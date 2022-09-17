

public class HtmlApplication extends Application {

	@Override
	public Document createDocument() {
		return new HtmlDocument();
	}

	@Override
	public View createView() {
		return new HtmlView();
	}

}

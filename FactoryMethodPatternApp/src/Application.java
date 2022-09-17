
public abstract class Application {

	public abstract Document createDocument();
	public abstract View createView();
	public Document onNewDocument() {
		return createDocument();
	}
	public View onNewView() {
		return createView();
	}
}


public class PdfApplication extends Application {

	@Override
	public Document createDocument() {
		return new PdfDocument();
	}

	@Override
	public View createView() {
		return new PdfView();
	}

}

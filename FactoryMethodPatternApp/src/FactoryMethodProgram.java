
public class FactoryMethodProgram {

	public static void main(String[] args) {
		Application application = new HtmlApplication();
		Document document = application.createDocument();
		View view = application.createView();
		document.open();
		view.draw();
		/// etc....
		
		Application application1 = new PdfApplication();
		Document document1 = application1.createDocument();
		View view1 = application1.createView();
		document1.open();
		view1.draw();
	}

}

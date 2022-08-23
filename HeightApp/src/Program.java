
public class Program {

	public static void main(String[] args) {
		
		Height h1 = new Height();
		Height h2 = new Height();
		h1.setHeight(5, 8);
		h2.setHeight(5, 9);
		Height h3 = h1.add(h2);
		System.out.println("Sum of heights in cm - " + h3.getCm());
 
	}

}

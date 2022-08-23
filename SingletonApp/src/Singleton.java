
public class Singleton {
	
	private int num;
	
	private static Singleton single = null;
	
	public void setNum(int num) {
		this.num = num;
	}
	// make the constructor private so that we dont create object using new
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(single == null) {
			single =  new Singleton();
		} 
			return single;
	}
}

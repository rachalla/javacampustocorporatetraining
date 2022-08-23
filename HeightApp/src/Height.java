
public class Height {

	private int ft, inch;
	
	public void setHeight(int ft, int inch) {
		this.ft = ft;
		this.inch = inch;
	}
	
	public double getCm() {
		return 2.54 * (ft*12 + inch);
	}
	
	public Height add(Height ht) {
		Height temp = new Height();
		
		temp.ft = this.ft + ht.ft;
		temp.inch = this.inch + ht.inch;
		if(temp.inch >= 12) {
			this.ft++;
		}
		return temp;
	}
}

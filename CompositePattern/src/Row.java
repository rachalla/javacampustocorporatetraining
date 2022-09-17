
public class Row extends Composite { // Two different kinds of "con-
	public Row(int val) {
		super(val);
	} // tainer" classes. Most of the

	public void traverse() { // "meat" is in the Composite
		System.out.print("Row"); // base class.
		super.traverse();
	}
}
// Purpose.  Bridge design pattern
// 1. Create an implementation/body base class
// 2. Derive the separate implementations from the common abstraction
// 3. Create an interface/wrapper class that "hasa" and delegates to the impl
// 4. Embellish the interface class with derived classes if desired

public class Stack { // 3. Create an interface/wrapper class that
	protected StackImp imp; // "hasa" implementation object and delegates

	public Stack(String s) { // all requsts to it
		if (s.equals("java"))
			imp = new StackJava();
		else
			imp = new StackMine();
	}

	public Stack() {
		this("java");
	}

	public void push(int in) {
		imp.push(new Integer(in));
	}

	public int pop() {
		return ((Integer) imp.pop()).intValue();
	}

	public boolean isEmpty() {
		return imp.empty();
	}
}

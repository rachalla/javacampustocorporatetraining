
public class StackMine implements StackImp { // 2. Derive the separate impl's
	private Object[] items = new Object[20]; // from the common abstraction
	private int total = -1;

	public Object push(Object o) {
		return items[++total] = o;
	}

	public Object peek() {
		return items[total];
	}

	public Object pop() {
		return items[total--];
	}

	public boolean empty() {
		return total == -1;
	}
}

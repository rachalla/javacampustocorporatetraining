
// Purpose.  Iterator design pattern

// Take traversal-of-a-collection functionality out of the collection and
// promote it to "full object status".  This simplifies the collection, allows
// many traversals to be active simultaneously, and decouples collection algo-
// rithms from collection data structures.

// 1. Design an internal "iterator" class for the "collection" class
// 2. Add a createIterator() member to the collection class
// 3. Clients ask the collection object to create an iterator object
// 4. Clients use the first(), isDone(), next(), and currentItem() protocol

import java.util.*;

public class IntSet {
	private Hashtable ht = new Hashtable();

	// 1. Design an internal "iterator" class for the "collection" class
	public static class Iterator {
		private IntSet set;
		private Enumeration e;
		private Integer current;

		public Iterator(IntSet in) {
			set = in;
		}

		public void first() {
			e = set.ht.keys();
			next();
		}

		public boolean isDone() {
			return current == null;
		}

		public int currentItem() {
			return current.intValue();
		}

		public void next() {
			try {
				current = (Integer) e.nextElement();
			} catch (NoSuchElementException e) {
				current = null;
			}
		}
	}

	public void add(int in) {
		ht.put(new Integer(in), "null");
	}

	public boolean isMember(int i) {
		return ht.containsKey(new Integer(i));
	}

	public Hashtable getHashtable() {
		return ht;
	}

	// 2. Add a createIterator() member to the collection class
	public Iterator createIterator() {
		return new Iterator(this);
	}
}

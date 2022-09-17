// Purpose.  Composite design pattern

// 1. Create a "lowest common denominator" that makes classes interchangeable
// 2. All concrete classes declare an "isa" relationship to the interface
// 3. All "container" classes couple themselves to the interface
// 4. "Container" classes use polymorphism as they delegate to their children

public interface Component {
	void traverse();
} // 1. "lowest common denominator"
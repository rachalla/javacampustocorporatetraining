// Purpose.  Decorator design pattern

// 1. Create a "lowest common denominator" that makes classes interchangeable
// 2. Create a second level base class for optional functionality
// 3. "Core" class and "Decorator" class declare an "isa" relationship
// 4. Decorator class "hasa" instance of the "lowest common denominator"
// 5. Decorator class delegates to the "hasa" object
// 6. Create a Decorator derived class for each optional embellishment
// 7. Decorator derived classes delegate to base class AND add extra stuf
// 8. Client has the responsibility to compose desired configurations

interface Widget {
	void draw();
} // 1. "lowest common denominator"
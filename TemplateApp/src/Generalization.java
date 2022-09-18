
// Purpose. Template Method design pattern

// 1. Standardize the skeleton of an algorithm in a base class "template" method
// 2. Common implementations of individual steps are defined in the base class
// 3. Steps requiring peculiar implementations are "placeholders" in base class
// 4. Derived classes can override placeholder methods
// 5. Derived classes can override implemented methods
// 6. Derived classes can override and "call back to" base class methods

public abstract class Generalization {
	// 1. Standardize the skeleton of an algorithm in a "template" method
	public void findSolution() {
		stepOne();
		stepTwo();
		stepThr();
		stepFor();
	}

	// 2. Common implementations of individual steps are defined in base class
	protected void stepOne() {
		System.out.println("Generalization.stepOne");
	}

	// 3. Steps requiring peculiar impls are "placeholders" in the base class
	abstract protected void stepTwo();

	abstract protected void stepThr();

	protected void stepFor() {
		System.out.println("Generalization.stepFor");
	}
}
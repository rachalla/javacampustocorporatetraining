
public class MethodOverridingMain {

	public static void main(String[] args) {
		/* When Parent class reference refers to the parent class object
		 * then in this case overridden method (the method of parent class)
		 *  is called.
		 */
		Base obj = new Base();
		obj.show();

		/* When parent class reference refers to the child class object
		 * then the overriding method (method of child class) is called.
		 * This is called dynamic method dispatch and runtime polymorphism
		 */
		Base obj2 = new Derived();
		obj2.show();

	}

}

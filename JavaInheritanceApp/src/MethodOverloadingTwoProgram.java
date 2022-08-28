class AdderTwo {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

public class MethodOverloadingTwoProgram {
	public static void main(String[] args) {
		System.out.println(AdderTwo.add(11, 11));
		System.out.println(AdderTwo.add(12.3, 12.6));
	}
}

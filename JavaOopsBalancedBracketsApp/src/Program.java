
public class Program {

	public static void main(String[] args) {
		String expr = "([{}])";
		BalancedBrackets balancedBrackets = new BalancedBrackets();  
        // Function call
        if (balancedBrackets.areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

	}

}

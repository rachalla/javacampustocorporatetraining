
public class DynamicBindingProgram {

	public static void main(String[] args) {

		Bank bank = new ICICIBank();
		System.out.println(bank.getInterest());
		
		bank = new SBIBank();
		System.out.println(bank.getInterest());
		
		bank = new HDFCBank();
		System.out.println(bank.getInterest());

	}

}

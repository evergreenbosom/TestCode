package Interview;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.toString();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//Dynamic polymorphism:
		// Child Class object can be referred by parent Interface reference var.
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
	
		

	}

}

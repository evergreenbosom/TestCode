package Interview;

public class HSBCBank implements USBank, BrazilBank {// We are achieving multiple inheritance
	//Is-a relationship
	
	//If a class is implementing any Interface, then its mandatory to define/override all the method of Interface.
	//Overriding from US Bank
	public void credit() {
		System.out.println("HSBCBank ----Credit");
		 
	}
	public void debit() {
		System.out.println("HSBCBank ----Debit");
		
	}
	public void transferMoney() {
		System.out.println("HSBCBank --transferMoney");
		
	}
	//Seperate methods of HSBC BAnk
	public void educationLoan() {
		System.out.println("HSBC Bank Edu Loan");
	}
	public void carLoan() {
		System.out.println("HSBC Bank Car Loan");
	}
	//Brazil Bank Method:OverLoading from BrazilBank
	public void mutualFund() {
		System.out.println("HSBC ---Mutual Fund ");
	}

}

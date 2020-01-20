package Interview;

public class ThrowsException {
	public static void main(String[] args)throws ArithmeticException {
		
		 ThrowsException obj = new ThrowsException();
		 obj.sum();
		 System.out.println("ABC");
			
}
	public void sum() throws ArithmeticException{
		try {
		div();
	}catch(ArithmeticException e) {
		
	}
	}
	public void div()throws ArithmeticException {
		int i =9/0;//exception line
	}
}

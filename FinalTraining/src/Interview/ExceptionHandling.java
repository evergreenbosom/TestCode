package Interview;

public class ExceptionHandling {
	int a = 10;
	
	public static void main(String [] args)throws ArithmeticException {
		ExceptionHandling obj = new ExceptionHandling();
		obj.sum();
		
		//a.Uncaught Exception
		//int i = 9/0;
		//System.out.println(i);
		
		//b.Caught Exception:
		//theread.sleep(2000);
		
		
		
		
		//1. try catch block:
		try {
			int i = 9/0; // this code will throw an exception
			
		} catch (Throwable e) {//Throwable/Exception is a supper class error or Exception handling
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		System.out.println("ABC");
		
		
	}

	private void sum() {
		// TODO Auto-generated method stub
		
	}
	
	
	}
	



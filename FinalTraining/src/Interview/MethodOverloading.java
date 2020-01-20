package Interview;

public class MethodOverloading {
	String name = "Tom";
	static int age = 25;
		

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		sum(20, 30);
		MethodOverloading.sum(30, 40);
		
	//We can not create a method inside a method.
	//Method OverLoading: when the method name is same with different arguments or input parameters or different data type within the same class.
	// We can overload main method also with different arguments.
	}
	public void sum() {
		System.out.println("Sum Method -- Zero Program");
	}
	public void sum(int i) {
		System.out.println("Sum 1 Method"); 
		System.out.println(i);
		
	}
	public static void sum(int k, int l) {
		//System.out.println("Sum Two Method");
		System.out.println(k +  l);
		
	}

}

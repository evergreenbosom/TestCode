package OOpconcept;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphishm /complile time polymorphism - means one to many. 
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		System.out.println("*******");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		//Top Casting
		Car c1 = new BMW();//Child class object can be referred by parrent class reference variable - dynamic /Runtime Polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		//BMW b1 = (BMW)new Car(); ClassCastException.
		
	
		
	
		
		

	}

}

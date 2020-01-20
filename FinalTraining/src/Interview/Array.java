package Interview;

public class Array {

	public static void main(String[] args) {
	//Dis-Advantages of Array:
	//1. Size is Fixed: Static array : To Overcome from thsi problem we use collections -Dynamic array - ArrayList
	//2. It stores only similar data types: To Overcome from this problem, we use Object array.
		//int array
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50; ArrayIndexOutOfBoundsException: 4
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//to print all the values of array: use for loop:
		for (int j = 0; j < i.length; j++) {
			System.out.println(j);
			
		}
		
		System.out.println(i.length);
		
	}
	
}

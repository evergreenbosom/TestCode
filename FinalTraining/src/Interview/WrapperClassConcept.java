package Interview;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		
		//Data Conversion: String to int:
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to Double conversion:
		String y = "12.50";
		double d = Double.parseDouble(y);
		System.out.println("Double value is = " + (d + 7.5));
		
		//String to Boolean:
		
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		// int to String:
		int j = 200;
		System.out.println(j+20);
		String s = String.valueOf(j);
		System.out.println(s+20);
	}

}

package Interview;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add('M');
			
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(8));
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			
			
		}
		ar.add("Imran");
		ar.add("Lima");
		ar.add("Iham");
		ar.add("Momtaz");
		
		for (int j = 0; j < ar.size(); j++) {
			System.out.println(ar.get(j));
			System.out.println(ar.size());
			
			
			
			
			System.out.println(ar.size());
			
			
		}
			
		}		
		
		
		
		
		

	}



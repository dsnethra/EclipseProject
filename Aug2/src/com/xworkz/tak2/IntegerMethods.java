package com.xworkz.tak2;

public class IntegerMethods {
	
	public static void main(String[] args) {
		int ref1 = 10;
		int ref2 = 29;
		
		System.out.println(Integer.compare(ref1, ref2));
		
		System.out.println(Integer.max(ref1,ref2));
		System.out.println(Integer.min(ref1,ref2));
		
		Integer ref = new Integer(ref1);
		int ref3 = ref.reverse(ref2);
		
		System.out.println(ref3);
		
	}

}

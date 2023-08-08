package com.xworkz.tak2;

public class StringMethods {
	String name="deepa";
	
	
	
	public static void main(String[] args)
	{
		String name1="deepa";
		String name2="nethra";
		
		//static methods of String
		
		System.out.println(name1.compareToIgnoreCase(name2));
		
		
		System.out.println(name1.equalsIgnoreCase(name2));
		
                   char ref=name2.charAt(0);
                   System.out.println(ref);
                   
                  String ref4= name1.concat(name2);
                  System.out.println(ref4);
                  
                 int ref5= name2.hashCode();  
                 System.out.println(ref5);
                 
                  
		
		
		
	}

}

package com.xworkz.override;

public class Methodsss {
	static String name;
	 String location;
	
	
	static void method1(String name,String location)
	{
	name=name;
	
	}

	
	void method2(String name,String location)
	{
		this.name=name;
		this.location=location;
		
	}

	

}

package com.xworkz.application;

public class Csk {
	
	String captain;
	String famousFor;
	int age;
	int jersyNumber;
	
	
	Csk(String captain,String famousFor,int age,int jersyNumber)
	{
		this.captain=captain;
		this.famousFor=famousFor;
		this.age=age;
		this.jersyNumber=jersyNumber;
	}

	
	void printInfo()
	{
		System.out.println(this.captain);
		System.out.println(this.famousFor);
		System.out.println(this.age);
		System.out.println(this.jersyNumber);
	}
	
	
	
}

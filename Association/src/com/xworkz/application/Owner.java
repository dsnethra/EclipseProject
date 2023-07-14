package com.xworkz.application;

public class Owner {
	
	String ownerName;
	int age;
	double networth;
	
	
	
	
	Owner(String ownerName,int age,double networth)
	{
		this.ownerName=ownerName;
		this.age=age;
		this.networth=networth;

	}
	
	
	void printInfo()
	{
		System.out.println("owner name :"+ this.ownerName);
		System.out.println("owner age :"+ this.age);
		System.out.println("owner netwirth :"+ this.networth);
	}

}

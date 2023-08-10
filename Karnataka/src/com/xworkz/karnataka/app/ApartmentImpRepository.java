package com.xworkz.karnataka.app;

import com.xworkz.karnataka.ApartmentRepository;

public class ApartmentImpRepository implements ApartmentRepository {
	
	private String[] arr=new String[TOTAL_APARTMENT];
	private int  index=0;
	

	@Override
	public void apartmentName(String name) {
		System.out.println("invoking apartmentName in apartmentrpository implement");
		this.arr[index]=name;
		if(index<TOTAL_APARTMENT)
		{
		System.out.println("apartment name is :"+ name + "index :"+index);
		index=index+1;
		System.out.println("next index  is :"+ index);
		}
		
		else
		{
			System.out.println("no space to store");
		}
		
		
		
		
	}
	
	
	@Override
	public void display()
	{
		for(index=0;index<TOTAL_APARTMENT;index++)
		{
			System.out.println("Apartment name :" +arr[index] + "index :"+ index);
		}
	}
	
	
	
}

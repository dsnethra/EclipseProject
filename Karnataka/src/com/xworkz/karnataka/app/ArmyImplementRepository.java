package com.xworkz.karnataka.app;

import com.xworkz.karnataka.ArmyRepository;

public class ArmyImplementRepository implements ArmyRepository {
	
	private String[] arr=new String[TOTAL_NAME];
	private  int index=0;

	@Override
	public void name(String name) {
		System.out.println("invoking name in ArmyImplementRepository");
		if(index<TOTAL_NAME)
		{
			System.out.println("index :"+ index + "ArmyName :"+ arr[index]);
			index=index+1;
			System.out.println("next index is :"+ index);
		}
		
		else
		{
			System.err.println("no space for storage");
		}
		
		
	}
	
	
	@Override
	public void display()
	{
		System.out.println("index :"+index + "Army name :"+arr[index]);
	}

}

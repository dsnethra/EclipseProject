package com.xworkz.karnataka.app;

import com.xworkz.karnataka.PoliticianRepository;

public class PoliticianImpRepository implements PoliticianRepository {
	
	 private String name;
	 String[] arr=new String[TOTAL_NAME];
	 int index=0;
	
	@Override
	public void name() {
	System.out.println("invoking name in PoliticianImp");
	
	}
	
	public void politicianName(String name)
	{
		
		this.arr[index]=name;
		if(index<arr.length)
		{
	     System.out.println("politicians names are   :" +name + "  index is :"+index);
		index=index+1;
        System.out.println("next index is :" + index);
		}
		else 
		{
			System.out.println("there is no space to store");
		}
		
	}
	
	@Override
	public void display()
	{
		for(int index=0; index<TOTAL_NAME;index++)
		{
			System.out.println("politicion index :"+ index +"name :"+ arr[index]);
		}
	}
	
	
	
	
	
	
	
	

	
	

}

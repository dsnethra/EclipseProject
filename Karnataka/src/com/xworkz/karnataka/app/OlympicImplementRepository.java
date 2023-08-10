package com.xworkz.karnataka.app;

import com.xworkz.karnataka.OlympicRepository;

public class OlympicImplementRepository  implements OlympicRepository{
	
	private int[] arr=new int[TOTAL_GAME_YEAR];
	private int index=0;

	@Override
	public void olympicYear(int year) {
		this.arr[index]=year;
		if(index<TOTAL_GAME_YEAR)
		{
			System.out.println("present index is :"+ index);
			System.out.println("index :"+index + "year :"+ year);
			index=index+1;
			System.out.println("next index is :"+index);
		}
		else
		{
			System.out.println("no space to hold the data");
		}
		
	}
		
		@Override
		
		public void display()
		{
			for(index=0;index<TOTAL_GAME_YEAR;index++)
			{
				System.out.println("Olumpic year  :" +arr[index] + "index :"+ index);
			}
		}
	}



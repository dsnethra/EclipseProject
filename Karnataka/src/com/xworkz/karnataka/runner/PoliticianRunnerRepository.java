package com.xworkz.karnataka.runner;

import com.xworkz.karnataka.PoliticianRepository;
import com.xworkz.karnataka.app.PoliticianImpRepository;

public class PoliticianRunnerRepository {

	public static void main(String[] args)
	{
		PoliticianImpRepository ref=new PoliticianImpRepository();
		ref.name();
		 ref.politicianName("modi");
		 ref.politicianName("bys");
		 ref.politicianName("pratap");
		 ref.politicianName("bys1");
		 ref.politicianName("modi1");
		 ref.politicianName("bys3");
		 ref.politicianName("modi4");
		 ref.politicianName("bys4");
		 ref.politicianName("modi7");
		 ref.politicianName("bys8");
		 ref.politicianName("bys111");
		
		 
		 ref.display();
		
		
	}
}

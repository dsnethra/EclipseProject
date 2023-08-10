package com.xworkz.karnataka.runner;

import com.xworkz.karnataka.ApartmentRepository;
import com.xworkz.karnataka.app.ApartmentImpRepository;

public class ApartmentRunnerRepository {
	public static void main(String[] args)
	{
		ApartmentImpRepository ref=new ApartmentImpRepository();
		ref.apartmentName("Sankalpa");
		ref.apartmentName("NS");
		ref.apartmentName("SN");
		ref.apartmentName("JSN");
		ref.apartmentName("Mahi");
		
		ref.display();
		
	}

}

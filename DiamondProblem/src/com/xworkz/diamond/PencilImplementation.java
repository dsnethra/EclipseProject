package com.xworkz.diamond;

public class PencilImplementation implements NatarajaPencil,ApsaraPencil {
	
	@Override
	public  void sharp()
	{
		System.out.println("invoking sharp in PencilImplementation");
	}

	@Override
	public  void price()
	{
		System.out.println("invoking price in pencilimplementation");
	}

	
	@Override
	public  void colour()
	{
		System.out.println("invoking colour in pencilimplementation");
	}
	
}

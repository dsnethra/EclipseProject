package com.xworkz.village.inner;

public class InnerVillage2 {
	
	private void enter()
	{
		System.out.println("running enter in private InnerVillage2");
	}

	private void exit()
	{
		System.out.println("running exit in  private InnerVillage2");
	}
	
	
	public static void main(String[] args)
	{
		InnerVillage2 ref= new InnerVillage2();
		ref.enter();
		ref.exit();
		
	}
}

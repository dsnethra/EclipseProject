package com.xworkz.village.outer;

public class OuterVillage2 {

	public static void main(String[] args) {
		
		InnerVillage2 ref=new InnerVillage2();
		ref.enter();   // this is not possible bcz AS is private which is accessble only inside the same class
		ref.exit();
		

	}

}

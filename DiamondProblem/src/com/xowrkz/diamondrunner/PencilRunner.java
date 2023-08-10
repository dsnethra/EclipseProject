package com.xowrkz.diamondrunner;

import com.xworkz.diamond.ApsaraPencil;
import com.xworkz.diamond.NatarajaPencil;
import com.xworkz.diamond.Pencil;
import com.xworkz.diamond.PencilImplementation;

public class PencilRunner {

	public static void main(String[] args) {
		
		PencilImplementation ref=new PencilImplementation();
		ref.sharp();
		ref.colour();
		ref.price();
		System.out.println("   ");
		
		ApsaraPencil ref1=new PencilImplementation();
		ref1.colour();
		ref1.sharp();
		System.out.println("  ");
		
		
		NatarajaPencil ref2=new PencilImplementation();
		ref2.price();
		System.out.println("  ");
		
		Pencil ref3=new PencilImplementation();
		ref3.sharp();
		ref3.sharp();
		System.out.println("  ");
		
		
		
		
	}
}

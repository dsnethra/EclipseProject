package com.xworkz.runner;

import com.xworkz.abstrac.Kidney;
import com.xworkz.implement.KidneyImplement;

public class KidneyRunner {

	public static void main(String[] args)
	{
		
		Kidney ref=new KidneyImplement();
		KidneyUser ref2=new KidneyUser(ref);
		ref2.purify();
	}
}

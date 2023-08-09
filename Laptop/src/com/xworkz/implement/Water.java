package com.xworkz.implement;

import com.xworkz.abstrac.Waterpurify;

public class Water  implements Waterpurify{

	@Override
	public boolean filter() {
		System.out.println("invoking filter in water");
		return true;
	}
	
	

}

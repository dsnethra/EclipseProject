package com.xworkz.implement;

import com.xworkz.abstrac.Waterpurify;

public class KapilWater {
	
	private Waterpurify waterpurify;
	
	public KapilWater(Waterpurify waterpurify) {
		this.waterpurify = waterpurify;
	}
	
	public void water() {
		if(waterpurify!=null) {
			System.out.println("not null values");
			this.waterpurify.filter();
		}
		else {
			System.err.println();
		}
	}

}



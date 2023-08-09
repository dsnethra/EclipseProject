package com.xworkz.runner;

import com.xworkz.abstrac.Waterpurify;
import com.xworkz.implement.KapilWater;
import com.xworkz.implement.Water;

public class WaterRunner {
public static void main(String[] args) {
		
		Waterpurify water1 = new Water();
		
		KapilWater kapil = new KapilWater(water1);
		kapil.water();

	}

}


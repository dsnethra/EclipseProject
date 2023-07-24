// public RUNNER

package com.xworkz.village.outer;

import com.xworkz.village.inner.InnerVillage;

public class OuterVillage {
	public static void main(String[] args) {
		
		InnerVillage ref=new InnerVillage();
		ref.enter();
		ref.exit();
		
	}

}

// DEFAULT RUNNER WHICH IS NOT WORKINGF

package com.xworkz.village.outer;

import com.xworkz.village.inner.InnerVillage1;

public class OuterVillage1 {

	public static void main(String[] args) {
		
		
		InnerVillage1 ref=new InnerVillage1();
		ref.enter();   // not possible bcz AS is default it can acess only in the same package irrespective of class
		ref.exit();    // not possible bcz AS is default it can acess only in the same package irrespective of class
	}

}

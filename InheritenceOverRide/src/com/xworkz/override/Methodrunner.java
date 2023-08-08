package com.xworkz.override;

public class Methodrunner {
	
	public static void main(String[] args)
	{
	
	int ref=RelatedMathod.method1();
	System.out.println(ref);
	
	RelatedMathod ref1=new RelatedMathod();
	int ref3=ref1.method2();
	
	System.out.println(ref1);
	
	}
	

}



  // OR



//public class Methodrunner {

//public static void main(String[] args)
//{


//System.out.println(RelatedMathod.method1());

//RelatedMathod ref=new RelatedMathod();
// System.out.println(ref.method2());



//}


//}

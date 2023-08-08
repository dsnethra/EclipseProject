package com.xworkz.armyrunner;

public class ArmyRunner {
	public static void main(String[] args)
	{
		Ah ref=new Ah();
		ref.hairCut();
		ref.time();
		
		BankImplement ref2=new BankImplement();
		ref2.silence();
		
		System.out.println(ref2.AGE_OF_THE_PERSON);
		
		
		MetroImplement ref3=new MetroImplement();
		ref3.ticket();
		
		AirportImplements ref4=new AirportImplements();
		ref4.passport();
		
		HusbandRulesImplements ref5=new HusbandRulesImplements();
		ref5.food();
		
		PubRulesImplements ref6=new PubRulesImplements();
		ref6.time();
		
		CompanyRulesImplements ref7=new CompanyRulesImplements();
		ref7.formalDress();
		
		WifeRulesImplements ref8=new WifeRulesImplements();
		ref8.noDrink();
		
		VtuRulesImplements ref9=new VtuRulesImplements();
		ref9.usn();
		}

}

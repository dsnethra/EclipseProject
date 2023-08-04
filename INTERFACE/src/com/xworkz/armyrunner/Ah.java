package com.xworkz.armyrunner;

import com.xworkz.army.ArmyRule;
import com.xworkz.army.HomeRules;

public class Ah implements ArmyRule,HomeRules

{
	@Override
public void  hairCut()
{
	System.out.println("running hairCut in Ah");
}
	@Override
public void time()
{
  System.out.println("running time in Ah");
}

}

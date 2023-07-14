package com.xworkz.application;

public class Ipl {
	
	String favoriteTeam;
	int players;
	String favoritePlayerName;
	String favoritePlayerWife;
	
	Csk csk=new Csk("Dhoni","cool captain",50,7);
	
	
	Ipl(String favoriteTeam,int players)
	{
		this.favoriteTeam=favoriteTeam;
		this.players=players;
	}
	
	void setFavorite(String favoritePlayerName)
	{
		this.favoritePlayerName=favoritePlayerName;
	}
	
	void printinfo()
	{
		System.out.println(this.favoriteTeam);
		System.out.println(this.players);
		System.out.println(this.favoritePlayerName);
		System.out.println(this.favoritePlayerWife);
		
		this.csk.printInfo();
	}

}

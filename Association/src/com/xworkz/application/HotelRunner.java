package com.xworkz.application;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("running main in HotelRunner");
		
		Hotel hotel=new Hotel("ajji mane", "rice bath");
		
		hotel.setLocation("kunigal");
		hotel.price=80;
		
		hotel.printinfo();

	}

}

package com.codegnan.controlstatements;

import java.util.Scanner;

public class Wishes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your city name : ");
String city=sc.next();
if(city.equalsIgnoreCase("AndhraPradesh")) {
	System.out.println("Hello Andhra .....namasthe!");
}else {
	if(city.equalsIgnoreCase("Hyderabad")) {
		System.out.println("Hello Hyderabadi .....Aadaab!");
	}else {
		if(city.equalsIgnoreCase("Chennai")) {
			System.out.println("Hello madrasi .....vanakkam!");
		}else {
			if(city.equalsIgnoreCase("Banglore")) {
				System.out.println("Hello kannadiga .....namaskara!");
			}
			else {
				if(city.equalsIgnoreCase("Kerala")) {
					System.out.println("Hello malayaliya .....vanakkam!");
				}
				else {
					System.out.println("please enter valid city name");
				}
			}
		}
	}
}
	}

}

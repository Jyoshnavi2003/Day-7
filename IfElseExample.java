package com.codegnan.controlstatements;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double account_balance=50000.0;
System.out.println("Enter the withdraw amount : ");
double amount=sc.nextDouble();
double avilable_balance=account_balance-amount;
if((amount%100==0)&&amount<=account_balance) {
	System.out.println("Withdraw amount is : "+amount + " successfully withdrawn! " + "Available Blanace is : "+avilable_balance);
}
	else {
		System.out.println("insufficient funds!");
	}
}
}

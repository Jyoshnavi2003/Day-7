package com.codegnan.controlstatements;

import java.util.Scanner;

public class ExampleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
        Scanner sc=new Scanner(System.in);
        double balance=1000;
        int pin=1212;
        System.out.println("Enter you pin");
        int enter_pin=sc.nextInt();
        if(enter_pin!=pin) {
        	System.out.println("Invalid pin!");
        }
        do {
       System.out.println("**********ATM MENU************");
       System.out.println("---------1.Check Balance-------------");
       System.out.println("---------2.Deposite-------------");
       System.out.println("---------3.Withdraw-------------");
       System.out.println("---------4.Exit-------------");
       System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice) {
        case 1:
        	System.out.println("Your Balance is "+balance);
        	break;
        case 2:
        	System.out.println("Enter Deposite Amount: ");
        	double deposite=sc.nextDouble();
        	if(deposite%100!=0) {
        		System.out.println("Please deposite multiple of hundared like [100,200,500,700]");
        	}else {
        		if(deposite<500) {
        			System.out.println("Please deposite more then 500rs");
        		}else {
        			balance+=deposite;
        			System.out.println("Deposited money is : "+deposite+"Successfully deposited ........Your balance is : "+balance); 
        		}
        	}
        	break;
        case 3:
        	System.out.println("PLease Enter Withdraw amount : ");
        	double withdraw=sc.nextDouble();
        	if(withdraw%100!=0) {
        		System.out.println("Please deposite multiple of hundared like [100,200,500,700]");
        	}else {
        		if(withdraw>balance) {
            		System.out.println("Insufficient funds");
        		}else {
        		balance-=withdraw;
        		System.out.println("WithDraw amount is "+withdraw+"Successfully withdrawn .......your balance is : "+balance);
        		
        	}
        	
        }
        	break;
        case 4:
        	System.out.println("EXIT .....Thnakyou!");
        	break;
        	
        default:
        	System.out.println("Invalid choice......please choose [1-4]");
	}
        }while(choice!=4);
        sc.close();
	}
}
"# Day-8" 

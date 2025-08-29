package com.codegnan.controlstatements;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks : ");
int marks=sc.nextInt();
if(marks>=90) {
	System.out.println("Grade is : O");
}else {
	if(marks>=80) {
		System.out.println("Grade is : S");
	}else {
		if(marks>=70) {
			System.out.println("Grade is : A");
		}
		else {
			if(marks>=60) {
				System.out.println("Grade is : B");
			}else {
				if(marks>=50) {
					System.out.println("Grade is : C");
				}else {
					if(marks>=40) {
						System.out.println("Grade is : D");
					}
					else {
						if(marks>=30) {
							System.out.println("Grade is : E");
						}
						else {
							if(marks<30) {
								System.out.println("Grade is : F");
							}
						}
					}
				}
			}
		}
	}
}
	}

}

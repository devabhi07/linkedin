package com.facebook;
import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the principal ");
		double principal = ip.nextDouble();
		System.out.println("Enter the rate ");
		double rate = ip.nextDouble();
		System.out.println("Enter the time ");
		double time = ip.nextDouble();
		
		double interest =(principal * time*rate)/100;

		System.out.println("Principal amount is: " + principal);
		System.out.println("Interest Rate is: " + rate);
		System.out.println("Time is: " + time);
		System.out.println("Total Interest is: " + interest);
	}

}

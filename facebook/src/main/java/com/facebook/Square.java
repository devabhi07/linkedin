package com.facebook;

import java.util.Scanner;


public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Double num;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextDouble();
		Double square = num*num;
		System.out.println("Square of "+ num + " is: "+ square);
		}
		

	}



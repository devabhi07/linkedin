package com.facebook;

import java.util.Scanner;

import com.facebook.controller.*;

public class MainClass {

	public static void main(String[] args) {
		String ss="y";
		
		while(ss.equals("y")) {
		System.out.println("******MAIN MENU*****");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to delete profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view all profile");
		
		System.out.println("Enter your choice");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		//if non static methods like createProfile,deleteProfile etc we want to call inside static method then we will call via object of that class
		
		AdminController m=new AdminController();
		
		switch(ch) {
		case 1 : m.createProfile();
			break;
		case 2: m.viewProfile();
			break;
		case 3:  m.editProfile();
			break;
		case 4 : m.deleteProfile();
			break;
		case 5: m.searchProfile();
			break;
		case 6:  m.viewAllProfile();
			break;
			
		default:System.out.println("wrong choice");
		}
		
		System.out.println("do you want to continue press y/n");
		ss=sc.next();
		}

	}
	
	
}
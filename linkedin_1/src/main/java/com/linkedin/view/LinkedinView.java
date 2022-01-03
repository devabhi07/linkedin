package com.linkedin.view;

import java.util.Scanner;

import com.linkedin.controller.LinkedinControllerInterface;
import com.linkedin.utility.ControllerFactory;

public class LinkedinView {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s="y";
		while(s.equals("y")) {
			
			
			System.out.println("______________Linkedin___________");
			System.out.println("              1 to Sign Up profile");
			System.out.println("              2 to view User Profile");
			System.out.println("              3 to view all User rofile");
			System.out.println("              4 to delete User Profile");
			System.out.println("              5 to Sign In profile");
			System.out.println("              6 to search User Profile");
			
			int ch=sc.nextInt();
			
			
			LinkedinControllerInterface lc=ControllerFactory.createObject();
			
			switch(ch) {
			case 1 : int i=lc.createProfileController();
						
					  if(i>0) {
						  System.out.println("Profile created");
					  }
					  else {
						  System.out.println("could not create profile");
					  }
				break;
				
			case 2 : int i1=lc.viewProfileController();
			  if(i1>0) {
				  System.out.println("Profile found");
			  }
			  else {
				  System.out.println("could not find profile");
			  }
		break;
			case 3 : int i2=lc.viewAllProfileController();
			  if(i2>0) {
				  System.out.println(i2+ " Profile  found");
			  }
			  else {
				  System.out.println("could not find profile");
			  }
		break;
		
			case 4 : int i3=lc.deleteProfileController();
			  if(i3>0) {
				  System.out.println( " Profile  deleted");
			  }
			  else {
				  System.out.println("could not delete profile");
			  }
		break;
			case 5 : int i4=lc.loginProfileController();
			  if(i4>0) {
				  System.out.println( " SignIn");
			  }
			  else {
				  System.out.println("password wrong or email wrong");
			  }
			case 6 : int i5=lc.searchProfileController();
			  if(i5>0) {
				  System.out.println( i5+" Profile found");
			  }
			  else {
				  System.out.println("profile not exit");
			  }
		break;
				default:System.out.println("wrong choice");
			}
			
			
			System.out.println("do you want to continue press y");
			s=sc.next();
		}

	}

}

package com.instagram;

import java.util.Scanner;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterfacce;

public class InstagramView {

	public static void main(String[] args) {
		String ss="y";
		while(ss.equals("y")){
		// TODO Auto-generated method stub
		System.out.println("**Main Menu**");
		System.out.println("1 create profile");
		System.out.println("2 view all pofile");
		
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		InstagramControllerInterfacce sc1 = new InstagramController();
		
		switch(ch) {
		case 1: int i=sc1.createProfileController();
				if(i>0) {
					System.out.println("Profile create successfully");
				}
				else {
					System.out.println("could not create profile");
				}
		
			break;
		case 2: int j=sc1.viewAllProfilecontroller();
				if(j>0) {
					System.out.println(j+" record found");
				}
				else {
					System.out.println("no record found");
				}
			break;
			default:System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		ss=sc.next();

	}

}
}
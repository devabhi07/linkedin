package com.instagram.controller;

import java.util.Scanner;

import com.instagram.entity.InstagramUser;
import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;

public class InstagramController implements InstagramControllerInterfacce {

	public int createProfileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter Password");
		String password=sc.next();
		
		System.out.println("Enter email");
		String email=sc.next();
		
		System.out.println("Enter address");
		String address=sc.next();
		
		InstagramUser su=new InstagramUser();
		su.setName(name);
		su.setPassword(password);
		su.setEmail(email);
		su.setAddress(address);
		
		InstagramServiceInterface ss=new InstagramService();
		int i=ss.createProfileService(su);
		
		
		return i;
		
		
		
		
	}

	public int viewAllProfilecontroller() {
		int aa=0;
		InstagramServiceInterface ss=new InstagramService();
		InstagramUser a[]=ss.viewAllProfileServie();
		for(int j=0;j<a.length;j++) {
			
		}
		for(InstagramUser s3:a) {
			if(s3!=null) {
				System.out.println("=============");
				System.out.println("name is "+s3.getName());
				System.out.println("Password is "+s3.getPassword());
				System.out.println("Email is "+s3.getEmail());
				System.out.println("Address is "+s3.getAddress());
				aa++;
			}
			else {
				break;
			}
		}
		
		
		return aa;
	}

}

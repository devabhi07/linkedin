package com.facebook.controller;

import java.util.Scanner;

import com.facebook.entity.FacebookUser;

public class AdminController {
	
	private static FacebookUser ff[]=new FacebookUser[10];
	
	public void createProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter Password");
		String password=sc.next();
		
		System.out.println("Enter Email");
		String email=sc.next();
		
		System.out.println("Enter Address");
		String address=sc.next();
		
		FacebookUser fb=new FacebookUser();
		fb.setName(name);
		fb.setPassword(password);
		fb.setEmail(email);
		fb.setAddress(address);
		
		for(int i=0;i<ff.length;i++) {
			if(ff[i]==null) {
				ff[i]=fb;
				System.out.println("profile created successfully");
				break;
			}
		}
	}
	public void viewProfile() {
		
	}
	public void editProfile() {
		System.out.println("profile edited");
	}
	public void deleteProfile() {
		System.out.println("profile deleted");
	}
	public void searchProfile() {
		System.out.println("profile searched");
	}
	public void viewAllProfile() {
		for(int i=0;i<ff.length;i++) {
			if(ff[i]!=null) {
			System.out.println("*****");
			System.out.println("Name is "+ff[i].getName());
			System.out.println("Password is "+ff[i].getPassword());
			System.out.println("Email is "+ff[i].getEmail());
			System.out.println("Address is "+ff[i].getAddress());
			}
		}
	}
	
	
}
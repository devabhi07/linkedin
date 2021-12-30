package com.facebook;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 65657658, reverse = 0;  
		while(number != 0)   
		{  
		int a = number % 10;  
		reverse = reverse * 10 + a;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  

}

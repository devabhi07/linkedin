package com.facebook;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int maxNumber = 20; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	           
	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
	}



	}



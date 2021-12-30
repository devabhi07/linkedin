package com.facebook;

public class fact {
	static int fac(int n)
    {
        if (n == 0)
            return 1;
 
        return n * fac(n - 1);
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
        System.out.println("Factorial of " + num
                           + " is " + fac(8));

	}

}

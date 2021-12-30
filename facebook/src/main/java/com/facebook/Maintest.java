package com.facebook;

import java.util.Scanner;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ss="y";
		
		while(ss.equals("y"))
		
		
		System.out.println("Enter your choice");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		
		
		
		switch(ch) {
		case 1 : Add.main(args);
			break;
		case 2: arravg.main(args);
			break;
		case 3:  avg.main(args);
			break;
		case 4:  centigrade.main(args);
		break;
		case 5:  circle.main(args);
		break;
		case 6:  fact.main(args);
		break;
		case 7:  Fib.main(args);
		break;
		case 8:  Loop.main(args);
		break;
		case 9:  PrimeOrNotPrime.main(args);
		break;
		case 10:  rev.main(args);
		break;
		case 11:  simpleinterest.main(args);
		break;
		case 12: Square.main(args);
		break;
		case 13: SquareRoot.main(args);
		break;
			
		default:System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		ss = sc.next();

	}

}

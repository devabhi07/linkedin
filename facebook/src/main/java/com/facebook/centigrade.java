package com.facebook;
import java.util.*;

public class centigrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("Temperature in Celsius:"+celsius);     

	}

}
package Homework4;

import java.util.Scanner;

public class ConvertTempFarhToCelsius {

	public static void main(String[] args) {
		
		Scanner convertC = new Scanner(System.in);
		System.out.println("Enter the Celsius temperature for convertion:");
		int c = convertC.nextInt();
		int f = (9*c + (32*5))/5;
		System.out.println( c + " degrees Celsius will be " + f + " degrees Fahrenheit." );
		Scanner convertF = new Scanner(System.in);
		System.out.println("Now, enter the Fahrenheit temperature, please:");
		int fhr = convertF.nextInt();
		int cls = (5*(fhr - 32))/9;
		System.out.println(fhr + " degrees Fahrenheit will be " + cls + " degrees Celsius.");
		
		
		

	}

}

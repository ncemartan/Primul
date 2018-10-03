package Homework4;

import java.util.Scanner;

public class MinutesToYearsAndDays {

	public static void main(String[] args) {
       Scanner minToYear = new Scanner(System.in);
       System.out.println("Enter the minutes:");
       int minutes = minToYear.nextInt();
       int days = minutes/(60*24)%365;
       int years = minutes/(60*24*365);
       System.out.println(minutes + " minutes has " + years + " year(s) and " + days + " day(s).");	
      
	
	}

}

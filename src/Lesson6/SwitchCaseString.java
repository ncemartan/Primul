package Lesson6;

import java.util.Scanner;

public class SwitchCaseString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter one day of the weekend:");
	      String day = sc.nextLine();	      
	      String days = " ";

	      switch (day){
	          case "MON":
	              days = " Monday, ";
	          case "WED":
	              days += "Wednesday and Friday";
	              System.out.println("We have lectures on:" + days +".");
	              break;
	          case "FRI":
	              days += " Friday";
	              System.out.println("We have lectures on: " + days + ".");
	              		
	              break;
	          case "TUE":
	              days += "Tuesday and Thursday";
	              System.out.println("We don't have lectures on: " + days + ".");
	              break;
	          case "THU":
	              days += "Thursday";
	              System.out.println("We don't have lectures on: " + days + ".");
	              break;
	          case "SAT":
	              days += " Saturday and Sunday";
	              System.out.println("These days are weekends:" + days + ".");
	              break;
	          case "SUN":
	              days += " Sunday ";
	              System.out.println("These days are weekends:" + days + ".");
	              break;
	          default:
	              System.out.println("Was inserted wrong string!");
	}

}
}

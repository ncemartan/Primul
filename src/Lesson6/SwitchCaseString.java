package Lesson6;

import java.util.Scanner;

public class SwitchCaseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day of the week:");
		String day = sc.next();
		switch (day) {
		case "MON" : System.out.println("MON, WED, FRI");
		break;
		case "TUE" : System.out.println("WED" + "FRI");
		break;
		case "WED" : System.out.println("WED" + "FRI");
		break;
		case "THU" : System.out.println("WED" + "FRI");
		break;
		case "FRI" : System.out.println("FRI");
		break;
		case "SAT" : System.out.println("No lessons.");
		break;
		case "SUN" : System.out.println("No lessons");
		break;
		default : System.out.println("Error!");
		break;
		}
	}

}

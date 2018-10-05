package Homework4;
import java.util.Scanner;
public class SwitchCaseDays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day of the week:");
		String day = sc.nextLine();
		String days = " ";
		
		switch(day) {
		case "FRI" : 
			days = "MON, WED, FRI";
			System.out.println(days);
			break;
		case "WED" :
			days = "MON, WED";
			System.out.println(days);
			break;
		case "MON" :
			days = "MON";
			System.out.println(days);
		    break;
		case "TUE" :
			days = " TUE,";		
		case "THU" :
			days += "THU,";
		case "SAT" : days += "SAT,";
		case "SUN" : days += "SUN";
		System.out.println("No lectures on these days:" + days);
		break;
         default : System.out.println("Error! Must be MON through SUN");
	}
	}
}

package Homework4;

import java.util.Scanner;

public class MarkNrToTextSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark from 0 to 10, please:");
		int marks = sc.nextInt();
		String textMark = " ";
		
		 switch(marks) {
		 case 0: textMark = "Fail!";
		 case 1: textMark = "Fail!";
		 case 2: textMark = "Fail!";
		 case 3: textMark = "Fail!";
		 case 4: textMark = "Fail!";
		 System.out.println(textMark);
		 break;
		 case 5: System.out.println("Approved.");
		 break;
		 case 6: System.out.println("Good.");
		 break;
		 case 7: textMark = "Very good!";
		 case 8: textMark = "Very good!";
		 System.out.println(textMark);
		 break;
		 case 9: textMark = "I'm proud of you!";
		 case 10: textMark = "I'm proud of you!";
		 System.out.println(textMark);
		 break;
		 default: System.out.println("Error! Marks must be in a range of 0 to 10!");
		 
		 
		 }
	}

}

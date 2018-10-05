package Homework4;

import java.util.Scanner;

public class TextMarkNumericalMark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerical mark from 0 to 10:");
		int mark = sc.nextInt();
		
		if (4 >= mark &&  !(0 > mark)) {
			System.out.println("Fail!");
		}else if (mark == 5) {
			System.out.println("Approved.");
		}else if (mark == 6) {
			System.out.println("Good.");
		}else if (mark == 7 || mark == 8) {
			System.out.println("Very good!");			
		}else if (mark == 9 || mark == 10) {
			System.out.println("I'm proud of you!");
		}else {
			System.out.println("Marks must be in a range of 0 to 10!");
		}

	}

}

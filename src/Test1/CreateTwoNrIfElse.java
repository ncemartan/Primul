package Test1;

import java.util.Scanner;

public class CreateTwoNrIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first nr:");
		int nr1 = sc.nextInt();
		System.out.println("Enter the second nr:");
		int nr2 = sc.nextInt();
		System.out.println("Enter the third nr:");
		int nr3 = sc.nextInt();
		if (nr1 == nr2 && nr2 == nr3) {
			System.out.println("All numbers are equal.");
		}
		else if (nr1 > nr2 || nr1 > nr3) { 
			System.out.println("The greater nr is: " + nr1);
				
		}else if (nr2 > nr1 || nr2 > nr3) {
			System.out.println("The greater nr is: " + nr2);
		}
		else if (nr3 > nr2 || nr3 > nr1) {
			System.out.println("The greater nr is: " + nr3);
		}else if (nr1 == nr2 && nr1 == nr3 ){
			System.out.println("All numbers are equal!");
		}		
		else if (nr1 == nr2) {
			System.out.println(nr1 + " equals to " + nr2);
		}else if (nr2 == nr3) {
			System.out.println(nr2 + " equals to " + nr3);
		}else if (nr1 == nr3) {
			System.out.println(nr1 + " equals to " + nr3);
		}
		
		
		

	}

}

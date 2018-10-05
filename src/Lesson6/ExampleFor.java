package Lesson6;

import java.util.Scanner;

public class ExampleFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int nr = sc.nextInt();
		
		for (int i = 0; i < nr; i++) {
			System.out.print(" " + i);
			
		}
		

	}

}

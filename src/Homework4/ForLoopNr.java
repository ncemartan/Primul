package Homework4;

import java.util.Scanner;

public class ForLoopNr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number, please:");
		int nr = sc.nextInt();
		System.out.println("These are the numbers divided to 2, lower than " + nr + ":");
		
		for (int div2 = 2; div2 < nr; div2+=2 ) {
			
			System.out.print(div2 +" ");
		}
		
	}

}

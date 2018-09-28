package Homework4;

import java.util.Scanner;

public class TwoIntegerScan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers:");
		int[] array = new int[2];		
		for (int nr = 0; nr < 2; nr++)	
		array[nr] = scan.nextInt();
		
		int nrSum = array[0] + array[1];
		int nrDiff = array[0] - array[1];
		int nrProd = array[0] * array[1];
		int nrAvg = (array[0] + array[1])/2;
		int nrRemndr = array[0] % array[1];
		
		System.out.println("The sum of the numbers is " + nrSum);
		System.out.println("The difference is " + nrDiff);
		System.out.println("The product is " + nrProd);
		System.out.println("The average is " + nrAvg);
		System.out.println("The remainder of the division is " + nrRemndr);
		

	}
	
}

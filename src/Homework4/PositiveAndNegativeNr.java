package Homework4;
import java.util.Scanner;
public class PositiveAndNegativeNr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int nr = sc.nextInt();
		
		if (nr>0) {
			System.out.println("Number is positive.");
		}else {
			System.out.println("Number is negative.");
		}
	}

}

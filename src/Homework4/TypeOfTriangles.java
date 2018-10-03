package Homework4;
import java.util.Scanner;


public class TypeOfTriangles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the first side length: ");
		double side1 = sc.nextDouble();
		System.out.println("Provide the second side length: ");
		double side2 = sc.nextDouble();
		System.out.println("Provide the third side length: ");
		double side3 = sc.nextDouble();
		
		if (side1 == side2 && side1 == side3) {
			System.out.println("This triangle is equilateral!");
		} else if (side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("This triangle is isosceles!");
		}else {
				System.out.println("This triangle is scalene!");
			}
		}
	}



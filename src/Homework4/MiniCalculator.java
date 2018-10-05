package Homework4;

import java.util.Scanner;

public class MiniCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nr1, nr2;
		char operator;
		System.out.println("Enter the first number, please:");
		nr1 = sc.nextDouble();
		System.out.println("Enter the operator (+,-,/,*)");
		operator = sc.next().charAt(0);
		System.out.println("Enter the second number, please:");
		nr2 = sc.nextDouble();
	
		double add = nr1 + nr2;
		double sub = nr1 - nr2;
		double mult = nr1*nr2;
		double div = nr1/nr2;
		int nr1a = (int)nr1;// converted double to integer for display
		int nr2a = (int)nr2;
		
		
		switch(operator) {
		case '+' : System.out.println(nr1a + "+" + nr2a + " = " + add);
		break;
		case '-' : System.out.println(nr1a + "-" + nr2a + " = " + sub);
		break;
		case '*' : System.out.println(nr1a + "*" + nr2a + " = " + mult);
				break;
		case '/' : System.out.println(nr1a + "/" + nr2a + " = " + div);
		break;
		default : System.out.println("Error! Incorrect operator!");
		}
	}

}

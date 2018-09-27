package Test1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	String name = "Nelu";
	String surname = "Cemirtan.";
	String message = "My name is " + name + " " + surname;
    System.out.println(message);
    
    double price = 2.5;
    double tax = 3.2;
    int quantity = 4;
    double total = price * tax * quantity;
   String message2 = "Total cost with tax is: " + total;
    System.out.println(message2);
    
    Scanner  sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String name2 = sc.nextLine();
    System.out.println("String has been entered.\n");
    System.out.println("String number is " + name2);
    int age = sc.nextInt();
    System.out.println("Enter your age:");
    System.out.println(name2 + age);
    
    
    
    
    
}
}

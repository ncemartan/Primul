package Test1;

public class MainClassD {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2;
		int var1 = 12;
		int var2 = 13;
		var2 = var1;
		
		dog1.age = 3;
		dog2 = dog1;
		dog2.age = 12;
		
		System.out.println("dog1.age " + dog1.age);
		System.out.println("dog1 " + dog1);
		System.out.println("dog2.age " + dog2.age);
		System.out.println("dog2" + dog2);
		System.out.println("var1 " + var1);
		System.out.println("var2 " + var2);
		
		
		System.out.println("----------------");
		System.out.println("new class");
		
		
	
		
	
		
	}

}

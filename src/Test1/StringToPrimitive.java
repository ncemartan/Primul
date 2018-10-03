package Test1;

public class StringToPrimitive {

	public static void main(String[] args) {
	String bool = "trUe";	
	boolean bool1 = Boolean.parseBoolean(bool);
	boolean bool2 = Boolean.parseBoolean("trUe");
	
	System.out.println(bool);
	System.out.println(bool1);
	System.out.println(bool2);
	}

}

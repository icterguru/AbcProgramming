package test;

public class BadSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		badSwap(2, 3);
	}
	static public void badSwap(int var1, int var2)
	{
		System.out.println("Before swaping:: var1 = " + var1);
		System.out.println("Before swaping:: var2 = " + var2);
		
	  int temp = var1;
	  var1 = var2;
	  var2 = temp;

		System.out.println("After swaping:: var1 = " + var1);
		System.out.println("After swaping var2 = " + var2);
	  
	  
	}
}

package test;
class Animal 
{ 
	public void callme()
	{
		System.out.println("In callme of Animal");
	}
}


class Dog extends Animal 
{ 
	public void callme()
	{
		System.out.println("In callme of Dog");
	}

	public void callme2()
	{
		System.out.println("In callme2 of Dog");
	}
}

public class UseAnimals 
{
	public static void main (String [] args) 
	{
		
		
		Dog d = new Dog();      
		

		Animal a = (Animal)d;  // upcasting
		d.callme();
		a.callme();
		((Dog) a).callme2(); // recasting / downcasting


		Animal a1 = new Animal();
		System.out.println("\n");
		a1.callme();

		Animal a2 = (Animal) new Dog();
		a2.callme();
		// Above two lines are equivalent to the following single line
		 ((Animal) new Dog()).callme();  // A complicated but good statement

		try{
			Animal d2 =  (Animal) new Dog();  /// It is okay
			
			System.out.println("\n Inside the try block...");
			d2.callme();		
			 
			Animal d4 = (Dog) new Animal();  /// It is NOT okay
			d4.callme();   // Exceptions happens so this line will not be executed
			
			 ((Dog) new Animal()).callme(); 
			
			
		}
		catch (Exception e)
		{ 	
			System.out.println(e);
			System.out.println("Inside the catch block ");

	

		}

		finally{

			System.out.println("Outside the try/catch block ");
		}
	}
}
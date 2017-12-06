package test;

/* File name : Animal.java */
interface IAnimal {
	 abstract void eat();
	
    public static void travel() {
	   System.out.println("Default Animal  travels");
}
}

public class MammalInt implements IAnimal {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
     
      IAnimal.travel();
      
      IAnimal a = new MammalInt();
      
   
     ((MammalInt) a).travel();
     System.out.println(((MammalInt) a).getClass());
     
   }
} 
package test;
strictfp public class StrictfpDemo {

    float f = 9.67834456677743523342423523432423423f;
    
    strictfp public void displayValue()
    { 

        System.out.println(f);
        System.out.println(String.format("%.25f", f));
        System.out.println(f);
    }

 public static void main(String[] args) {
  StrictfpDemo strictfpDemo = new StrictfpDemo();
  strictfpDemo.displayValue();

 }
}
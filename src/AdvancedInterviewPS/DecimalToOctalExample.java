package AdvancedInterviewPS;
import java.util.Scanner;
class DecimalToOctalExample
{
   public static void main(String args[])
   {
     Scanner input = new Scanner( System.in );
     System.out.print("Enter a decimal number : ");
     int num =input.nextInt();
     String str = Integer.toOctalString(num);     
     System.out.println("Method 1: Decimal to octal: "+str);
       
     // For storing remainder
     int rem;
        
     // For storing result
     String str2 = ""; 

     String str1 = "0123456789ABCDEF";
     char digits[] = str1.substring(0, 8).toCharArray();
     
     // Digits in octal number system
     //char oct[] = {'0','1','2','3','4','5','6','7'};
 
     int base = 8;
     while(num>0)
     {
       rem = num % base; 
       str2= digits[rem] + str2; 
       num = num / base;
     }
     
        System.out.println("Method 2: Decimal to octal: "+str2);
  }
}
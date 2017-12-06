package AdvancedInterviewPS;
import java.util.Scanner;
class DecimalToHexExample
{
   public static void main(String args[])
   {
     Scanner input = new Scanner( System.in );
     System.out.print("Enter a decimal number : ");
     int num =input.nextInt();

     String str = Integer.toHexString(num);
     System.out.println("Method 1: Decimal to hexadecimal: " + str);
      
     // For storing remainder
     int rem;
        
     // For storing result
     String output=""; 

     String str1 = "0123456789ABCDEF";
     char digits[] = str1.substring(0, 16).toCharArray();
    
     // Digits in hexadecimal number system
   //  char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     int base = 16;
     while(num > 0)
     {
       rem = num % base; 
       output = digits[rem] + output; 
       num = num / base;
     }
     System.out.println("Method 2: Decimal to hexadecimal: "+output);
     
    }
}
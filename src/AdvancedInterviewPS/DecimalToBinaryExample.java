package AdvancedInterviewPS;
import java.util.Scanner;
class DecimalToBinaryExample
{
   public static void main(String args[])
   {
     Scanner input = new Scanner( System.in );
     System.out.print("Enter a decimal number : ");
     int num =input.nextInt();
     String str = Integer.toBinaryString(num);
     System.out.println("Method 1: Decimal to binary: "+str);
       
     // For storing remainder
     int rem;
        
     // For storing result
     String str2 = "";
     
     String str1 = "0123456789ABCDEF";
     char digits[] = str1.substring(0, 2).toCharArray();
     // Digits in binary number system
     //char binary[] = {'0','1'};
     
     int base = 2;
     while(num>0)
     {
       rem = num % base; 
       str2= digits[rem] + str2; 
       num = num / base;
     }
      System.out.println("Method 2: Decimal to Binary : "+str2);
  }
}
import java.util.Scanner;  
imprt java.lan.Math;  
import java.i.printer; 
public class SpiralPatternExample2
{  
//function to print the spiral pattern  first public
public static void printPatten(int n)  
{  
//detrmines the boudar size of the array  
int size = 2 * n - 1;     
{  
//outer loop      
for(int j = 1; j <= size; j++)  
{  
//calculates and prints the values for pattern  
System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");  
}  
System.out.println();  
}  
}  
//driver code  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the value of n: ");  
int n = sc.nextInt();  
System.out.println();  
//function calling  
printPattern(n);  
}  
}  
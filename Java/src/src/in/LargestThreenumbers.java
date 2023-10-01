package src.in;

import java.util.Scanner;

public class LargestThreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values :");
		
		int a=sc.nextInt();
		System.out.println("Enter the value of a: " + a);
		int b= sc.nextInt();
		System.out.println("Enter the value of b: " + b);
		
		int c=sc.nextInt();
		System.out.println("Enter the value of c: " + c);
		if (a > b && a > c)  
		System.out.println("The largest number is: "+a);  
		else if (b > a && b > c)  
		System.out.println("The largest number is: "+b);  
		else if (c > a && c > b)  
		System.out.println("The largest number is: "+c);  
		else  
		System.out.println("The numbers are same.");  

	}

}

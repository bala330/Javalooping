package src.in;

import java.io.InputStream;
import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				if (i==j||j==temp) {
					System.out.print("*");
					
				} else {
					System.out.print(" ");

				}
			}
			temp--;
			System.out.println();
		}
		
	}	
}
	






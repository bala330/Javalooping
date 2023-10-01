package src.in;

import java.util.Scanner;

public class NumberPattern {
	int row,column;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number values : ");
		int number=sc.nextInt();
		int startingnumber=1;
		
		
for(int row=0;row<number;row++) {
	for(int column=0;column<=row;column++) {
		System.out.print(startingnumber+ " ");
		startingnumber=startingnumber+1;
	}
	System.out.println();
}

	}

}

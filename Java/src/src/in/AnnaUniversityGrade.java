package src.in;

import java.util.Scanner;

public class AnnaUniversityGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks of obtained :");
		int num=sc.nextInt();
		switch (num/10) {
		case 10:
			System.out.println("The grade is S");
			break;
		case 9:
			System.out.println("The grade is A");
			break;
		case 8:
			System.out.println("The grade is B");
			break;
		case 7:
			System.out.println("The grade is C");
			break;
		case 6:
			System.out.println("The grade is D");
			break;
		case 5:
			System.out.println("The grade is E");
			break;
		case 4:
			System.out.println("The grade is F");
			break;
		default:
			System.out.println("It Invalid mark");
			break;
		}
			
	}
	

}

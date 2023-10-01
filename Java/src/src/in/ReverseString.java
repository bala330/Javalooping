package src.in;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("original string :" );
		String original=sc.next();
		String reverse=" ";
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println("Reverse the string :"+ reverse);

	}

}

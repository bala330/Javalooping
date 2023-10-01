package src.in;

import java.util.Iterator;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Guvi of Greeks";
		String reve=" ";
		for(int i=original.length()-1;i>=0;i--) {
		reve=reve+original.charAt(i);
		}
		System.out.println("reverse the string :"+reve);
		if (original.equals(reve)) {
			System.out.println("It is palindrome");
			
		} else {
			System.out.println("It is not palindrome");

		}
	
	}

}

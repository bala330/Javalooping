package src.in;

import java.util.Scanner;

public class HotelSwitchcase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the months: ");
		int month=sc.nextInt();
		System.out.println("Enter the days: ");
		int days=sc.nextInt();
		System.out.println("Enter the original rent: ");
		
		 float originalrent=sc.nextFloat();
		float rent;
		float weekends;

switch (month) {
case 1:rent=(days*originalrent*20/100);
 weekends=originalrent+rent;
System.out.println("April to june: "+weekends);
	break;
	
case 2:rent=(days*originalrent*20/100);
weekends=originalrent+rent;
System.out.println("November to december :"+weekends);

default:
	rent=(days*originalrent);
	System.out.println("Weekdays is normal price only:"+rent);
	break;
}
		

	
	}

}

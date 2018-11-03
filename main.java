package leap_year;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year in 4 digit:\n");
		int year=sc.nextInt();
		if(year%4==0) 
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
	}
}

package power_two;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nth term for counting power:\n");
		int value=sc.nextInt();
		int p;
		if(value >= 31) {
			System.out.println("Value must be less than 31");
		}else {
			for(int i=1;i<=value;i++) {
				p=power(i);
				System.out.println("Power of"+i+" ="+p);
			}
		}
		
	}

	private static int power(int n) {
		// TODO Auto-generated method stub
		int count=1,base=2;
		
			while(n!=0) {
				count=count*base;
				--n;
			}
			return count;
		
		
	}
	
}

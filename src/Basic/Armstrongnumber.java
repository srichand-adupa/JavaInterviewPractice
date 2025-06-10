package Basic;


import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String[]args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enert number here : ");
		int number = sc.nextInt();
		int original = number;
		
		int sum =0;
		
		int digits  = String.valueOf(number).length();
		while (number>0) {
			int digit = number%10;
			sum+=Math.pow(digit, digits);
			number=number/10;
		}
		if(sum==original ) {
			System.out.println(original + " is a Armstrong number");
		}
		else {
			System.out.println(original + " is not a Armstrong number");
		}
	}
	
	
}

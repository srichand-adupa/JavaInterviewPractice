package Basic;
import java.util.Scanner;
public class SwappingNumbersWithThirdVariable {

	public static void main (String []args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 variable values here");
		
		 a = sc.nextInt();
		 b= sc.nextInt();
		System.out.println("You enterd a:"+a+"b: "+b);
		int c = a+b;
		
		a= c-a;
		b= c-b;
		
		 System.out.println("after swapping the variables a:"+a+"b:"+b);
		 
		
	}
}

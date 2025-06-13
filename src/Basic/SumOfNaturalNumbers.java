package Basic;
import java.util.Scanner;
public class SumOfNaturalNumbers {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter natuaral number here: ");
	
		n = sc.nextInt();
		sc.close();
		
//		int sum = (n*(n+1))/2;
//		
//		System.out.println("Sum of first "+n+" Natureal number is"+sum);
//		
		int sum =0;
		
		for(int i=1 ; i<=n;i++) {
				sum+=i;
		}
		System.out.println("Sum of first "+n+" Natureal number is"+sum);
	}
}

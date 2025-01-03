package patterns;

import java.util.Scanner;

public class Pattern11 {
	static void pattern11(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2*i-1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2*i-1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern11(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <= n-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
  }

}
		
//Output:
//		  * 
//	    * * * 
//	  * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
//  * * * * * * * 
//	  * * * * * 
//	    * * * 
//		  * 

package patterns;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
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
//	* * * * * * * * * 
//	  * * * * * * * 
//	    * * * * * 
//	      * * * 
//	        * 


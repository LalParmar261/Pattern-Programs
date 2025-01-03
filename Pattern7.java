package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		for (int row = 1; row <= n; row++) {
			for (int col = row; col <= n; col++) {
				System.out.print("- ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

//Output:
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 


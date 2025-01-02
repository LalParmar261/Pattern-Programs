package patterns;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==1 || i==2 || j==1 || j==2 || i==4 || i==5 || j==4 || j==5) {
					System.out.print("* ");
				}else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}
//Output:
//In else use space.
//	* * * * * 
//	* * * * * 
//	* *   * * 
//	* * * * * 
//	* * * * * 

// In else part at space use #.
//* * * * * 
//* * * * * 
//* * # * * 
//* * * * * 
//* * * * * 

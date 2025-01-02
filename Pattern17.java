package patterns;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of iterations: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==j ||  j== n-i+1) {
					System.out.print("O ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
			
		}
	}
}

//Output:
//	Enter the No. of iterations: 
//		5
//		O - - - O 
//		- O - O - 
//		- - O - - 
//		- O - O - 
//		O - - - O 


  

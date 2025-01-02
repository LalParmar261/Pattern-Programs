package patterns;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of iterations: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==j) {
					System.out.print("X ");
				}
				else {
					System.out.print("O ");
				}
			}
			System.out.println();
			
		}
	}
}

//Output:
//	Enter the No. of iterations: 
//
//		5
//		X O O O O 
//		O X O O O 
//		O O X O O 
//		O O O X O 
//		O O O O X 


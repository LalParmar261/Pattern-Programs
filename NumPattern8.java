package patterns;

import java.util.Scanner;

public class NumPattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i%2==0) {
					System.out.print("2 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}

//Output:
//	Enter the Number: 
//		5
//		
//		1 
//		2 2 
//		1 1 1 
//		2 2 2 2 
//		1 1 1 1 1 
  
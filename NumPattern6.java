package patterns;

import java.util.Scanner;

public class NumPattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		for (int i = 1, p = n; i <= n; i++, p--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}
}

//Output:
//	Enter the Number: 
//		5
//		
//		5 
//		4 4 
//		3 3 3 
//		2 2 2 2 
//		1 1 1 1 1 

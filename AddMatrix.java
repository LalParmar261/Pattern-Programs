package patterns;

import java.util.Scanner;

public class AddMatrix {
	public static void main(String[] args) {
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data of first Matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the data of second Matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("First Matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Second Matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Sum of Two Matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

//Output:
//	Enter the data of first Matrix: 
//		1
//		2
//		3
//		4
//		Enter the data of second Matrix: 
//		1
//		2
//		3
//		4
//		First Matrix: 
//		1 2 
//		3 4 
//		Second Matrix: 
//		1 2 
//		3 4 
//		Sum of Two Matrix: 
//		2 4 
//		6 8 


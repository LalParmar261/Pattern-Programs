package patterns;

import java.util.Scanner;

public class AddMatrix3_3 {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data of first Matrix: ");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the data of second Matrix: ");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("First Matrix: ");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Second Matrix: ");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of Two 3*3 Matrix: ");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
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
//		5
//		6
//		7
//		8
//		9
//		Enter the data of second Matrix: 
//		1
//		2
//		3
//		4
//		5
//		6
//		7
//		8  
//		9
//		First Matrix: 
//		1 2 3 
//		4 5 6 
//		7 8 9 
//		Second Matrix: 
//		1 2 3 
//		4 5 6 
//		7 8 9 
//		Sum of Two 3*3 Matrix: 
//		2 4 6 
//		8 10 12 
//		14 16 18 

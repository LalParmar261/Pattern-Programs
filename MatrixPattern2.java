package patterns;

import java.util.Scanner;

public class MatrixPattern2 { // *-------- Transpose Matrix ------*
	public static void main(String[] args) {
		int a[][] = new int[2][2];
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the Array Data: ");
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				a[i][j] = n.nextInt();
			}
		}
		System.out.println("Array Matrix: ");
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix: ");
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}	
}

//Output:
//	Enter the Array Data: 1
//	2
//	3
//	4
//	Array Matrix: 
//	1 2 
//	3 4 
//	Transpose Matrix: 
//	1 3 
//	2 4 

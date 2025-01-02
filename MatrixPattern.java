package patterns;

import java.util.Scanner;

public class MatrixPattern {	 // *------ Mirror Matrix -------*
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
		System.out.println("Mirror Matrix: ");
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j >= 0; j--) {
				System.out.print(a[i][j] + " ");
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
//	Mirror Matrix: 
//	2 1 
//	4 3 


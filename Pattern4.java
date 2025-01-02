package patterns;

public class Pattern4 {
	static void pattern4(int n)

	{
		for (int row = 0; row < 2 * n; row++) {
			int totalColsInRow = row > n? 2 * n - row : row;
			
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
				}
			System.out.println();
			}
		}
	static void pattern44(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n-1; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern444(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i+j>n+1) 
					break;
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		pattern4(5);
//		pattern44(5);
//		pattern444(5);
	}
}

//Output: 1
//
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

//Output: 2
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

//Output:3
//
//* 
//* * 
//* * * 
//* * 
//* 



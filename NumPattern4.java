package patterns;

public class NumPattern4 {
	static void numPattern4(int n) {
		n = n * 2;
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= n; col++) {
				int atEveryIndex = Math.min(Math.min(row, col), Math.min(n -row, n - col));
				System.out.print(atEveryIndex + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		numPattern4(5);
	}
}

//Output:
//	0 0 0 0 0 0 0 0 0 0 0 
//	0 1 1 1 1 1 1 1 1 1 0 
//	0 1 2 2 2 2 2 2 2 1 0 
//	0 1 2 3 3 3 3 3 2 1 0 
//	0 1 2 3 4 4 4 3 2 1 0 
//	0 1 2 3 4 5 4 3 2 1 0 
//	0 1 2 3 4 4 4 3 2 1 0 
//	0 1 2 3 3 3 3 3 2 1 0 
//	0 1 2 2 2 2 2 2 2 1 0 
//	0 1 1 1 1 1 1 1 1 1 0 
//	0 0 0 0 0 0 0 0 0 0 0 

package patterns;

public class NumPattern2 {
	static void numPattern2(int n) {
		for (int row = 1; row <= n; row++) {
			for (int spaces = 0; spaces < n - row; spaces++) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}System.out.println("");
			
		}
	}
	public static void main(String[] args) {
		numPattern2(6);
	}
}

//Output:
//     1
//    212
//   32123
//  4321234
// 543212345
//65432123456

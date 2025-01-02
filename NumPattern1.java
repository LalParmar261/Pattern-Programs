package patterns;

public class NumPattern1 {
	static void numPat1(int n)
	{
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void numPat2(int n)
	{
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	static void numPat3(int n)
	{
		int count = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		numPat1(5);
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
		numPat2(5);
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
		numPat3(5);
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
	}
}
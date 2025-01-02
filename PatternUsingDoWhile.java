package patterns;

public class PatternUsingDoWhile {
	public static void main(String[] args) {
		int i = 1;
		do {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
			i++;
		} while (i <= 5);
	}
}

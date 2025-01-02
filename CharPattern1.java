package patterns;

public class CharPattern1 {
	static void patter1() {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	static void patter2() {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	static void patter3() {
		char count = 'A';
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		patter1();
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
		patter2();
//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 
		patter3();
//		A 
//		B C 
//		D E F 
//		G H I J 
//		K L M N O 

	}
}

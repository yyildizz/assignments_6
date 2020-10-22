package assignments_6;

public class Question_2 {

	public static void main(String[] args) {

		int line = 7;

		for (int i = line; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= line; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}
	}

}
